package com.example.memo.model;

public class BaseRegister <T>{
    private String name;
    private String username;
    private String email;
    private String password;
    private String updateAt;
    private String createAd;
    private String id;

    public BaseRegister(String name, String username, String email, String password, String updateAt, String createAd, String id) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
        this.updateAt = updateAt;
        this.createAd = createAd;
        this.id = id;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public String getCreateAd() {
        return createAd;
    }

    public void setCreateAd(String createAd) {
        this.createAd = createAd;
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
