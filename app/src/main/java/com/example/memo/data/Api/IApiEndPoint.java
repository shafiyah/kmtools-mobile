package com.example.memo.data.Api;

import com.example.memo.model.ArticleBasedonCategory;
import com.example.memo.model.ListAllArticle;
import com.example.memo.model.ResponseLogOut;
import com.example.memo.model.ResponseLogin;
import com.example.memo.model.ResponseSignIn;
import com.example.memo.model.BaseRegister;
import com.example.memo.model.ResponseUpdateUser;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface  IApiEndPoint {
    @FormUrlEncoded
    @POST("api/auth/login")
    Call<ResponseLogin> login(
       @Field("email") String emailUser,
       @Field("password") String passwordUser
    );

    @POST("register?")
    Call<ResponseSignIn>signIn(
            @Field("message") String Masage,
            @Field("data") BaseRegister data
    );

    @POST("logout")
    Call<ResponseLogOut>logout(
            @Field("message") String massage
    );

    @PUT("user/11")
    Call<ResponseUpdateUser>updateUser(
            @Field("name")  String nameUser,
            @Field("Username") String username,
            @Field("email") String emailUser,
            @Field("id_interest_category")int idInterest

    );

    @GET("article")
    Class<ListAllArticle>getListAllArticle(
            @Header("Authorization") BaseRegister data
    );

    @GET("articlearticle/category/1/?")
    Class<ArticleBasedonCategory>getArticleBasedonCategory(
            @Header("Authorization") BaseRegister data
    );

}


