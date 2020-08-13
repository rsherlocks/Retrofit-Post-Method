package com.example.androidshaper.retrofitpostmethod;

public class MainObjectClass {
    private String token;
    private DataObjectClass data;

    public MainObjectClass() {
    }

    public MainObjectClass(String token, DataObjectClass data) {
        this.token = token;
        this.data = data;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public DataObjectClass getData() {
        return data;
    }

    public void setData(DataObjectClass data) {
        this.data = data;
    }
}
