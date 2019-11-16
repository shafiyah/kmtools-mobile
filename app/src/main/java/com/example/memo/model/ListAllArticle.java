package com.example.memo.model;

import com.google.gson.annotations.SerializedName;

public class ListAllArticle <T>{

    @SerializedName("data")
    private  T data;

}
