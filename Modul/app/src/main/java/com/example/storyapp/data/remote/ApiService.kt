package com.example.storyapp.data.remote

import retrofit2.http.POST
import retrofit2.http.Body
import com.example.storyapp.data.remote.model.LoginRequest
import com.example.storyapp.data.remote.model.LoginResponse

interface ApiService {
    @POST("login")
    suspend fun login(@Body loginRequest: LoginRequest): LoginResponse

    // Tambahkan endpoint lain di sini
}