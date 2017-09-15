package com.example.tolmachenko.weatherappd;

import com.example.tolmachenko.weatherappd.model.Forecast;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Olga Tolmachenko on 15.09.17.
 */

interface ApiInterface {

    @GET("v1/public/yql")
    Call<List<Forecast>> getForecasts(@Query("q") String query,
                                   @Query("format") String format,
                                   @Query("env") String env,
                                   @Query("u") String units);
}
