package com.example.memo.data.Api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ApiRetrofit {
    public static final String BASE_URL ="https://test-kmtoolsv2.herokuapp.com/";
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
