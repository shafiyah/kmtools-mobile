package com.example.memo.model;

import androidx.constraintlayout.widget.Constraints;

public class BaseArticle {

    private int id;
    private String data;
    private String contetnt;
    private String lastEdited;
    private String published_date;
    private int idUser;
    private int idInterestCategory;
    private int idErrorReport;
    private String createdAt;
    private String updateAt;

    public BaseArticle() {
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getContetnt() {
        return contetnt;
    }

    public void setContetnt(String contetnt) {
        this.contetnt = contetnt;
    }

    public String getLastEdited() {
        return lastEdited;
    }

    public void setLastEdited(String lastEdited) {
        this.lastEdited = lastEdited;
    }

    public String getPublished_date() {
        return published_date;
    }

    public void setPublished_date(String published_date) {
        this.published_date = published_date;
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
