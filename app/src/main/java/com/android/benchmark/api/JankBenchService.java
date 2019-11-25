package com.android.benchmark.api;

import com.android.benchmark.models.Entry;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface JankBenchService {
    @POST("v1/results")
    Call<Entry> uploadEntry(@Body Entry entry);
}
