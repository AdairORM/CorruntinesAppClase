package com.example.corruntinesapp.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.rememberNestedScrollInteropConnection
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.job
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() { // vista modelo herredade de vista modelo
    var resultState by mutableStateOf("")
        private set //atributo solo d lectura
    var countTime by mutableStateOf(0)
        private set
    private var oneCount by mutableStateOf(false)

    fun fetchData(){
      val job = viewModelScope.launch {
            for (i in 1..5){ //contador de tiempo
                delay(1000
                )
                countTime  = i
            }
          oneCount = true
        }
        viewModelScope.launch {
            delay(5000) //tiempo de espera
            resultState  = "Respuesta desde el servidor Web"
        }
        if(oneCount){
            job.cancel() //se usa para cancelar tareas
        }

    }


/*
 Thread trabaja en el mismo contexto d el IU

    fun bloqeuoApp(){
        Thread.sleep(5000)
        resultState = "Respuesta del Servidor Web"
    }

 */
/*solo para la app
    fun fetchData(){
        viewModelScope.launch {
            delay(5000)
            resultState = "Respuesta desde el Servidor Web"
        }
    }

 */




}