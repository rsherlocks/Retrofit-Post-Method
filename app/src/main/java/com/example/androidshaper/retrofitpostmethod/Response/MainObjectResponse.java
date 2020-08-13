package com.example.androidshaper.retrofitpostmethod.Response;

import com.example.androidshaper.retrofitpostmethod.LastLogin;

public class MainObjectResponse {
    private String id;
    private String email;
    private String gender;
    private String name;
    private LastLogin last_login;

    public MainObjectResponse() {
    }

    public MainObjectResponse(String id, String email, String gender, String name, LastLogin last_login) {
        this.id = id;
        this.email = email;
        this.gender = gender;
        this.name = name;
        this.last_login = last_login;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LastLogin getLast_login() {
        return last_login;
    }

    public void setLast_login(LastLogin last_login) {
        this.last_login = last_login;
    }
}