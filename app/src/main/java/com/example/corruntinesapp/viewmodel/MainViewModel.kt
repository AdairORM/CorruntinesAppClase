package com.example.corruntinesapp.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() { // vista modelo herredade de vista modelo
    var resultState by mutableStateOf("")
        private set //atributo solo d lectura

    fun bloqeuoApp(){
        Thread.sleep(5000)
        resultState = "Respuesta del Servidor Web"
    }
}