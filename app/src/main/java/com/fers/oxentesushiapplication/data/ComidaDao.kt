package com.example.myapplication.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao //interface de acesso de objeto
interface ComidaDao {

    /*
    java exemplo
    * meuLivro = new Livro()
    * meuLivro.nome = "Marvel"
    * meuLivro.ano = 2022

    LivroDao.addLivro(meuLivro)*/

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addComida(comida: Comida)

    @Update
    fun atualizarComida(comida : Comida)

    @Delete
    fun deletarComida(comida : Comida)

    @Query("SELECT * FROM Comida_table")
    fun listarComida() : LiveData<List<Comida>>

    @Query("SELECT * FROM Comida_table ORDER BY id ASC")
    fun listarComidaEmOrdem() : LiveData<List<Comida>>
}