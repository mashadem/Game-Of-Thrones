package com.example.myapplication.data

import com.example.myapplication.data.model.AllCharacters
import retrofit2.http.GET
import retrofit2.http.Headers

interface ThronesApi {

    @Headers("Content-Type: application/json")
    @GET("api/v2/characters")
    suspend fun getAllCharacters(): AllCharacters

}