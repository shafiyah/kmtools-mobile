package com.example.memo.model;

import com.google.gson.annotations.SerializedName;

public class SettingInterestCategory<T> {
    @SerializedName("message")
    String message;
    @SerializedName("data")
    private T data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
