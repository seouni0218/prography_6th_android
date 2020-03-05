package com.example.viewpager;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitAPI {
    @GET("/films")
    Call<String> getMovieList();
}
