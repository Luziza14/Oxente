package com.example.myapplication.data

import androidx.lifecycle.LiveData

class ComidaRepository(private val comidaDao: ComidaDao) {

    val listarComida : LiveData<List<Comida>> = comidaDao.listarComida()

    suspend fun addComida(comida : Comida){
        comidaDao.addComida(comida)
    }

    suspend fun atualizarComida(comida : Comida){
        comidaDao.atualizarComida(comida)

    }

    suspend fun deletarComida(comida : Comida ){
        comidaDao.deletarComida(comida)
    }


}