package com.example.memo.data.Api;

import com.example.memo.model.Article;
import com.example.memo.model.ArticleBasedonCategory;
import com.example.memo.model.Categories;
import com.example.memo.model.ResponseLogOut;
import com.example.memo.model.ResponseLogin;
import com.example.memo.model.BaseResponse;
import com.example.memo.model.SettingInterestCategory;
import com.example.memo.model.User;
import com.example.memo.model.ResponseUpdateUser;
import com.example.memo.model.UserInterestCategory;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface  IApiEndPoint {

    @FormUrlEncoded
    @POST("api/auth/login")
    Call<ResponseLogin> login(
       @Field("email") String emailUser,
       @Field("password") String passwordUser
    );

    @FormUrlEncoded
    @POST("register")
    Call<BaseResponse<User>>signUp(
            @Field("name")String name,
            @Field("username")String username,
            @Field("email")String email,
            @Field("password")String password
    );

    @POST("logout")
    Call<ResponseLogOut>logout(
            @Field("message") String massage
    );

    @PUT("user/{id}")
    Call<ResponseUpdateUser>updateUser(
            @Field("name")  String nameUser,
            @Field("Username") String username,
            @Field("email") String emailUser,
            @Field("id_interest_category")int idInterest,
            @Path("id") int idUser
    );

    @GET("article")
    Call<BaseResponse<List<Article>>>getListAllArticle(
            @Header("Authorization") String token
    );

    @GET("article/recommendation")
    Call<ArticleBasedonCategory<List<Article>>>getArticleBasedonCategory(
            @Header("Authorization") String token
    );

    @GET("auth/user/get-category")
    Call<UserInterestCategory<Categories>> getInterest(
            @Header("Authorization") String token
    );

    @POST("auth/user/category")
    Call<SettingInterestCategory<Categories>> setInterest(
            @Field("message") String message,
            @Field("id_interest_category") int idInterest
    );

}


