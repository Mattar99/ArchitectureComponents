package com.co.cousins.injectionlearn.api;

import com.co.cousins.injectionlearn.database.entity.User;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Mattar on 8/24/2018.
 */

public interface UserWebservice {
    @GET("/users/{user}")
    Call<User> getUser(@Path("user") String userId);
}
