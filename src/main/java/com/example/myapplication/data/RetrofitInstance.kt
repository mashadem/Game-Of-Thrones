package com.example.myapplication.data

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    private val client = OkHttpClient.Builder().build()

    private val gson = GsonBuilder().create()

    val thronesApi: ThronesApi = Retrofit.Builder()
        .baseUrl("https://thronesApi.com/")
        .addConverterFactory(GsonConverterFactory.create(gson))
        .client(client)
        .build()
        .create(ThronesApi::class.java)

}