package com.example.myapplication.domain

import com.example.myapplication.data.Repository
import com.example.myapplication.data.model.AllCharacters

class CharacterUseCase {

    private val repository = Repository()

    suspend fun getAllCharacters(): AllCharacters? {
        return repository.getAllCharacters()
    }
}