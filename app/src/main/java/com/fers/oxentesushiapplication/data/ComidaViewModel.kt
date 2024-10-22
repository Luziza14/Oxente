package com.example.myapplication.data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class ComidaViewModel(application: Application): AndroidViewModel(application) {

    val listaComida: LiveData<List<Comida>>
    private var repository : ComidaRepository

    init{
        var comidaDao = ComidaDatabase.getDatabase(application).ComidaDao()
        repository = ComidaRepository(comidaDao)
        listaComida= repository.listarComida

    }

    fun addComida(comida:Comida){
        viewModelScope.launch(Dispatchers.IO){
            repository.addComida(comida)

        }
    }

    fun updateComida(comida:Comida){
        viewModelScope.launch(Dispatchers.IO){
            repository.atualizarComida(comida)

        }
    }

    fun deleteComida(comida:Comida){
        viewModelScope.launch(Dispatchers.IO){
            repository.deletarComida(comida)

        }
    }
}