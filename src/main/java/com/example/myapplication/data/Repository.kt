package com.example.myapplication.data

import com.example.myapplication.data.model.AllCharacters
import java.lang.Exception

class Repository {private val api = RetrofitInstance.thronesApi

    suspend fun getAllCharacters(): AllCharacters? {
        return try {
            api.getAllCharacters()
        } catch (e: Exception) {
            null
        }
    }
}