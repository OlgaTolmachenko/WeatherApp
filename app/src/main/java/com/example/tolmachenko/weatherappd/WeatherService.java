package com.example.tolmachenko.weatherappd;

import android.app.IntentService;
import android.content.Intent;

public class WeatherService extends IntentService {

    private static final String ACTION_FOO = "com.example.tolmachenko.weatherappd.action.FOO";

    public WeatherService() {
        super("WeatherService");
    }

//
//    public static void startActionFoo(Context context, String param1, String param2) {
//        Intent intent = new Intent(context, WeatherService.class);
//        intent.setAction(ACTION_FOO);
//        intent.putExtra(EXTRA_PARAM1, param1);
//        intent.putExtra(EXTRA_PARAM2, param2);
//        context.startService(intent);
//    }
//
    @Override
    protected void onHandleIntent(Intent intent) {
//        if (intent != null) {
//            final String action = intent.getAction();
//            if (ACTION_FOO.equals(action)) {
//                final String param1 = intent.getStringExtra(EXTRA_PARAM1);
//                final String param2 = intent.getStringExtra(EXTRA_PARAM2);
//                handleActionFoo(param1, param2);
//            } else if (ACTION_BAZ.equals(action)) {
//                final String param1 = intent.getStringExtra(EXTRA_PARAM1);
//                final String param2 = intent.getStringExtra(EXTRA_PARAM2);
//                handleActionBaz(param1, param2);
//            }
//        }
    }
}
