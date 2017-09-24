package com.example.tolmachenko.weatherappd;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent weatherIntent = new Intent(this, WeatherService.class);
        weatherIntent.setAction(Constant.ACTION_WEATHER);
        this.startService(weatherIntent);
    }
}
