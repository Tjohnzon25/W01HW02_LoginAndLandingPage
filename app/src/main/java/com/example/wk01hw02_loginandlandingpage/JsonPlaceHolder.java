package com.example.wk01hw02_loginandlandingpage;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolder {
    @GET("posts")
    Call<List<Post>> getPosts();
}
