package com.watermelonheart.quakemelon.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    private final static String BASE_URL = "https://earthquake.usgs.gov/fdsnws/event/1/";
    private static Retrofit retrofit = null;

    public static Retrofit getClint() {

        if(retrofit == null) {
           retrofit = new Retrofit.Builder()
                      .baseUrl(BASE_URL)
                      .addConverterFactory(GsonConverterFactory.create())
                      .build();
        }

        return retrofit;
    }

}
