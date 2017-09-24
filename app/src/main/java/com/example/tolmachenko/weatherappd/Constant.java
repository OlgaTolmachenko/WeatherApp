package com.example.tolmachenko.weatherappd;

/**
 * Created by Olga Tolmachenko on 15.09.17.
 */

public class Constant {

    public static final String ACTION_WEATHER = "com.example.tolmachenko.weatherappd.action.GET_WEATHER";
    public static final String BASE_URL = "https://query.yahooapis.com/";
    public static final String QUERY = "select * from weather.forecast where woeid in (select woeid from geo.places(1) where text=\"Odessa, ua\")";
    public static final String ENV = "store://datatables.org/alltableswithkeys";
}
