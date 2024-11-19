package com.example.sample.main_note;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Retrofitintence {

    public GitHubService instance()
    {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://cricbuzz-cricket.p.rapidapi.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GitHubService service = retrofit.create(GitHubService.class);
        return service;
    }


//    public GitHubService instance()
//    {
////       GET NOTES (GET KARVA MATE)
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("https://cricbuzz-cricket.p.rapidapi.com")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//
//
//        GitHubService service = retrofit.create(GitHubService.class);
//        return service;
//    }




}
