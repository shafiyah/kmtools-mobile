package com.example.memo.data.Api;

import com.example.memo.model.ListAllArticle;
import com.example.memo.model.ResponseLogin;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface IApiEndPoint {
    @FormUrlEncoded
    @POST("login")
    Call<ResponseLogin> login(
       @Field("email") String emailUser,
       @Field("password") String passwordUser
    );


}


