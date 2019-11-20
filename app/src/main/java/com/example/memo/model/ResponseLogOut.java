package com.example.memo.model;

import com.google.gson.annotations.SerializedName;

public class ResponseLogOut {
    @SerializedName("message")
    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
