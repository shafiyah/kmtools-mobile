package com.example.memo.Api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ApiRetrofit {
    public static final String BASE_URL ="https://www.google.com/";
    private  static  Retrofit retrofit;

    public static Retrofit getInstance(){
        if(retrofit==null){
            retrofit= new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
