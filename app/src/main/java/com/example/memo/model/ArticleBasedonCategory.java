package com.example.memo.model;

import com.google.gson.annotations.SerializedName;

public class ArticleBasedonCategory <T>{
    @SerializedName("data")
    private  T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
