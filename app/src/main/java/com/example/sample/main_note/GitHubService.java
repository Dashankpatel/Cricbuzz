package com.example.sample.main_note;

import com.example.sample.Getroot.Getroot;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface GitHubService {

//    @GET("/matches/v1/recent")
//    @Headers({"x-rapidapi-key: 57c305f7d2msh8e4ed1ad9dac300p1e4da7jsnf2726ce0dbe9"})
//    Call<Getroot> rot();

    @GET("/matches/v1/recent")
    @Headers({"x-rapidapi-key: 57c305f7d2msh8e4ed1ad9dac300p1e4da7jsnf2726ce0dbe9"})
    Call<Getroot> getnotes();

}
