package com.example.androidshaper.retrofitpostmethod;

import com.example.androidshaper.retrofitpostmethod.Response.MainObjectResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface OurRetrofitClient {

@POST("q")
    Call<MainObjectResponse> GetPostValue(@Body MainObjectClass mainObjectClass);
}
