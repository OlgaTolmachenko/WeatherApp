package com.example.tolmachenko.weatherappd;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewCompat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewCompat = (TextView) findViewById(R.id.textViewForTest);
        textViewCompat.setText(Constant.buildBaseUri());
    }
}
