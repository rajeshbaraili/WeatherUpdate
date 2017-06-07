package com.example.rajesh.weatherupdate.Network;

import com.example.rajesh.weatherupdate.Model;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestInterface {

    @GET("data/2.5/forecast?zip=94040&appid=b1b15e88fa797225412429c1c50c122a1")
    Call<Model> getJSON();
}
