package com.daniel.uts_daniel_wida_182102082.service;

import com.daniel.uts_daniel_wida_182102082.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetService {
    @GET("users")
    Call<List<User>> getUsersList();
}
