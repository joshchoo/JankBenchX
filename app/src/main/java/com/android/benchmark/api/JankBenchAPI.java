package com.android.benchmark.api;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.view.FrameMetrics;

import com.android.benchmark.config.Constants;
import com.android.benchmark.models.Entry;
import com.android.benchmark.models.Result;
import com.android.benchmark.results.GlobalResultsStore;
import com.android.benchmark.results.UiBenchmarkResult;
import com.topjohnwu.superuser.Shell;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class JankBenchAPI {
    public static boolean uploadResults(Context context, String baseUrl) {
        boolean success= false;
        Entry entry = createEntry(context);

        try {
            success = upload(entry, baseUrl);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return success;
    }

    private static boolean upload(Entry entry, String url) throws IOException {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        JankBenchService resource = retrofit.create(JankBenchService.class);

        Call<Entry> call = resource.uploadEntry(entry);
        Response<Entry> response = call.execute();

        return response.isSuccessful();
    }

    private static Entry createEntry(Context context) {
        int lastRunId = GlobalResultsStore.getInstance(context).getLastRunId();
        SQLiteDatabase db = GlobalResultsStore.getInstance(context).getReadableDatabase();
        int lastRunRefreshRate;
        try {
            lastRunRefreshRate = GlobalResultsStore.getInstance(context).loadRefreshRate(lastRunId, db);
        } finally {
            db.close();
        }
        HashMap<String, UiBenchmarkResult> resultsMap = GlobalResultsStore.getInstance(context).loadDetailedAggregatedResults(lastRunId);

        Entry entry = new Entry();

        entry.setRunId(lastRunId);
        entry.setBenchmarkVersion(Constants.BENCHMARK_VERSION);
        entry.setDeviceName(Build.DEVICE);
        entry.setDeviceModel(Build.MODEL);
        entry.setDeviceProduct(Build.PRODUCT);
        entry.setDeviceBoard(Build.BOARD);
        entry.setDeviceManufacturer(Build.MANUFACTURER);
        entry.setDeviceBrand(Build.BRAND);
        entry.setDeviceHardware(Build.HARDWARE);
        entry.setAndroidVersion(Build.VERSION.RELEASE);
        entry.setBuildType(Build.TYPE);
        entry.setBuildTime(String.valueOf(Build.TIME));
        entry.setFingerprint(Build.FINGERPRINT);
        entry.setRefreshRate(lastRunRefreshRate);

        String kernel_version = getKernelVersion();
        entry.setKernelVersion(kernel_version);

        List<Result> results = new ArrayList<>();

        for (Map.Entry<String, UiBenchmarkResult> resultEntry : resultsMap.entrySet()) {
            String testName = resultEntry.getKey();
            UiBenchmarkResult uiResult = resultEntry.getValue();

            Result result = new Result();
            result.setTestName(testName);
            result.setScore(uiResult.getScore());
            result.setJankPenalty(uiResult.getJankPenalty());
            result.setConsistencyBonus(uiResult.getConsistencyBonus());
            result.setJankPct(100 * uiResult.getNumJankFrames() / (double) uiResult.getTotalFrameCount());
            result.setBadFramePct(100 * uiResult.getNumBadFrames() / (double) uiResult.getTotalFrameCount());
            result.setTotalFrames(uiResult.getTotalFrameCount());
            result.setMsAvg(uiResult.getAverage(FrameMetrics.TOTAL_DURATION));
            result.setMs10thPctl(uiResult.getPercentile(FrameMetrics.TOTAL_DURATION, 10));
            result.setMs20thPctl(uiResult.getPercentile(FrameMetrics.TOTAL_DURATION, 20));
            result.setMs30thPctl(uiResult.getPercentile(FrameMetrics.TOTAL_DURATION, 30));
            result.setMs40thPctl(uiResult.getPercentile(FrameMetrics.TOTAL_DURATION, 40));
            result.setMs50thPctl(uiResult.getPercentile(FrameMetrics.TOTAL_DURATION, 50));
            result.setMs60thPctl(uiResult.getPercentile(FrameMetrics.TOTAL_DURATION, 60));
            result.setMs70thPctl(uiResult.getPercentile(FrameMetrics.TOTAL_DURATION, 70));
            result.setMs80thPctl(uiResult.getPercentile(FrameMetrics.TOTAL_DURATION, 80));
            result.setMs90thPctl(uiResult.getPercentile(FrameMetrics.TOTAL_DURATION, 90));
            result.setMs95thPctl(uiResult.getPercentile(FrameMetrics.TOTAL_DURATION, 95));
            result.setMs99thPctl(uiResult.getPercentile(FrameMetrics.TOTAL_DURATION, 99));

            results.add(result);
        }

        entry.setResults(results);

        return entry;
    }

    private static String getKernelVersion() {
        List<String> unameOutput = Shell.sh("uname -a").exec().getOut();
        String kernel_version = unameOutput.size() == 0 ? null : unameOutput.get(0);
        return kernel_version;
    }
}
