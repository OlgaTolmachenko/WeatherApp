package com.example.tolmachenko.weatherappd;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import com.example.tolmachenko.weatherappd.model.Query;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class WeatherService extends IntentService {


    public WeatherService() {
        super("WeatherService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        if (intent.getAction().equals(Constant.ACTION_WEATHER)) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(Constant.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            ApiInterface service = retrofit.create(ApiInterface.class);
            Call<Query> call = service.getForecasts(
                   Constant.QUERY, "json", Constant.ENV, "c");
            call.enqueue(new Callback<Query>() {
                @Override
                public void onResponse(Call<Query> call, Response<Query> response) {
                    Log.d("RESPONSE", String.valueOf(response.isSuccessful()));
                    Log.d("RESPONSE", String.valueOf(response.body().getCount()));
                }

                @Override
                public void onFailure(Call<Query> call, Throwable t) {
                    Log.d("RESPONSE", String.valueOf(t.getMessage()));

                }
            });
        }
    }
}
