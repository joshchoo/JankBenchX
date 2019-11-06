package com.android.benchmark.api;

import com.android.benchmark.models.Entry;

import org.junit.Test;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static org.junit.Assert.*;

public class JankBenchServiceTest {

    @Test
    public void uploadEntry() throws IOException {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://127.0.0.1:5000/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        JankBenchService resource = retrofit.create(JankBenchService.class);
        Entry entry = new Entry();  // TODO: Add data here

        Call<Entry> call = resource.uploadEntry(entry);
        Response<Entry> response = call.execute();

        assertTrue(response.isSuccessful());
    }
}