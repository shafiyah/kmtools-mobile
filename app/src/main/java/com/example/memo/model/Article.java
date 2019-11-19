package com.example.memo.model;

import androidx.constraintlayout.widget.Constraints;

import com.google.gson.annotations.SerializedName;

public class Article {
    @SerializedName("id")
    private int id;
    @SerializedName("title")
    private String title;
    @SerializedName("contend")
    private String content;
    @SerializedName("last_edited")
    private String lastEdited;
    @SerializedName("published_date")
    private String publishedDate;
    @SerializedName("id_user")
    private int idUser;
    @SerializedName("id_interest_category")
    private int idInterestCategory;
    @SerializedName("id_error_report")
    private int idErrorReport;
    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("updated_at")
    private String updateAt;
    @SerializedName("foto")
    private String foto;



    public Article() {
    }

    public String getFoto() {
        return foto;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return  title;
    }

    public void setData(String data) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLastEdited() {
        return lastEdited;
    }

    public void setLastEdited(String lastEdited) {
        this.lastEdited = lastEdited;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdInterestCategory() {
        return idInterestCategory;
    }

    public void setIdInterestCategory(int idInterestCategory) {
        this.idInterestCategory = idInterestCategory;
    }

    public int getIdErrorReport() {
        return idErrorReport;
    }

    public void setIdErrorReport(int idErrorReport) {
        this.idErrorReport = idErrorReport;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

}
