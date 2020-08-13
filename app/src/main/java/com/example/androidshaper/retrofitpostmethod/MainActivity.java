package com.example.androidshaper.retrofitpostmethod;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import android.os.Bundle;
import android.util.Log;

import com.example.androidshaper.retrofitpostmethod.Response.MainObjectResponse;

public class MainActivity extends AppCompatActivity {
    LastLogin lastLogin;
    DataObjectClass dataObjectClass;
    MainObjectClass mainObjectClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("http://app.fakejson.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        OurRetrofitClient ourRetrofitClient=retrofit.create(OurRetrofitClient.class);

        lastLogin=new LastLogin("dateTime|UNIX","172.242.228.245");
        dataObjectClass=new DataObjectClass("555","internetEmail","personGender","name",lastLogin);
        mainObjectClass=new MainObjectClass("tKMRSEUrAk6ka9OYfkPaIA",dataObjectClass);
        Call<MainObjectResponse> call= ourRetrofitClient.GetPostValue(mainObjectClass);
        call.enqueue(new Callback<MainObjectResponse>() {
            @Override
            public void onResponse(Call<MainObjectResponse> call, Response<MainObjectResponse> response) {

                if (response.isSuccessful())
                {
                    String id=response.body().getId();
                    String name=response.body().getName();
                    String email=response.body().getEmail();
                    LastLogin lastLoginResponse=response.body().getLast_login();
                    String date=lastLoginResponse.getData_time();
                    String ipv4=lastLoginResponse.getIp4();
                    Log.d("id", "onResponse:id: "+id);
                    Log.d("name", "onResponse:name: "+name);
                    Log.d("email", "onResponse:email: "+email);
                    Log.d("date", "onResponse:date: "+date);
                    Log.d("ipv4", "onResponse:ip: "+ipv4);
                }
                else {
                    Log.d("Error", "onResponse: not success ");
                }

            }

            @Override
            public void onFailure(Call<MainObjectResponse> call, Throwable t) {
                Log.d("Error", "onFailure: Message");

            }
        });


    }
}