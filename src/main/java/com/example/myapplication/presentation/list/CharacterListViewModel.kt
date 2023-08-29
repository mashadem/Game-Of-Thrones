package com.example.myapplication.presentation.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.data.model.AllCharacters
import com.example.myapplication.domain.CharacterUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CharacterListViewModel : ViewModel() {

    private val charactersUseCase = CharacterUseCase()
    private val charactersLiveData = MutableLiveData<AllCharacters?>()

    init {
        loadAllCharacters()
    }

    private fun loadAllCharacters() {
        viewModelScope.launch(Dispatchers.IO) {
            val characters = charactersUseCase.getAllCharacters()
            charactersLiveData.postValue(characters)
        }
    }

    fun charactersLiveData(): LiveData<AllCharacters?> {
        return charactersLiveData
    }
}