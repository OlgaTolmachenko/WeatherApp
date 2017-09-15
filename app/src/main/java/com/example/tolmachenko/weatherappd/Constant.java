package com.example.tolmachenko.weatherappd;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Created by Olga Tolmachenko on 15.09.17.
 */

public class Constant {

    public static final String BASE_URL = "query.yahooapis.com/";
    public static final String QUERY = "select * from weather.forecast where woeid in (select woeid from geo.places(1) where text=\"Odessa, ua\")";
    public static final String ENV = "store://datatables.org/alltableswithkeys";

//    public static String buildBaseUri() {
//
//        Uri.Builder uriBuilder = new Uri.Builder();
//        uriBuilder.scheme("https")
//                .authority(BASE_URL)
//                .appendQueryParameter("q", encodeQueryToUtf8(QUERY))
//                .appendQueryParameter("format", "json")
//                .appendQueryParameter("env", encodeQueryToUtf8(ENV))
//                .appendQueryParameter("u", "c");
//        Uri apiUri = uriBuilder.build();
//        return apiUri.toString();
//    }

    private static String encodeQueryToUtf8(String query) {
        String encodedQuery = "";

        try {
            encodedQuery = URLEncoder.encode(query, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return encodedQuery;
    }


}
