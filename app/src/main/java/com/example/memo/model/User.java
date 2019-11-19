package com.example.memo.model;

import com.google.gson.annotations.SerializedName;

public class User{

    @SerializedName("name")
    private String name;
    @SerializedName("username")
    private String username;
    @SerializedName("email")
    private String email;
    @SerializedName("password")
    private String password;
    @SerializedName("update_at")
    private String updateAt;
    @SerializedName("created_at")
    private String createAt;
    @SerializedName("id")
    private String id;



    public User(String name, String username, String email, String password, String updateAt, String createAd, String id) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
        this.updateAt = updateAt;
        this.createAt = createAd;
        this.id = id;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public String getCreateAd() {
        return createAt;
    }

    public void setCreateAd(String createAd) {
        this.createAt = createAd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
