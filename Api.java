package com.example.matthew.up2speed;

import java.util.Map;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;

public interface Api {
    String BASE_URL = "";

        @POST("api/v1/sessions")
        Call<User> login(
                @HeaderMap Map<String, String> headers,
                @Body User user);

        @POST("api/v1/users")
        Call<User> createUser(
                @HeaderMap Map<String, String> headers,
                @Body User user);
}

