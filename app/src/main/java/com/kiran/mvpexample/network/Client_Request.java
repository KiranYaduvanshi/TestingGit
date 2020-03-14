package com.kiran.mvpexample.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class Client_Request {

    private static Client_Request instance;
    Retrofit retrofit;
    public Api_Services services;
    private static String BASE_URL = "http://202.164.56.83/";

    private Client_Request() {

        retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        services = retrofit.create(Api_Services.class);

    }

    public static Client_Request getInstance() {
        if (instance == null) {
            instance = new Client_Request();
        }
        return instance;
    }


}
