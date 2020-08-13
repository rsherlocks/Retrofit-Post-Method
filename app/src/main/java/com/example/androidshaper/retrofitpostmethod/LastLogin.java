package com.example.androidshaper.retrofitpostmethod;

public class LastLogin {
    private String data_time;
    private  String ip4;

    public LastLogin() {
    }

    public LastLogin(String data_time, String ip4) {
        this.data_time = data_time;
        this.ip4 = ip4;
    }

    public String getData_time() {
        return data_time;
    }

    public void setData_time(String data_time) {
        this.data_time = data_time;
    }

    public String getIp4() {
        return ip4;
    }

    public void setIp4(String ip4) {
        this.ip4 = ip4;
    }
}
