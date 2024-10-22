package com.example.myapplication.data

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "Comida_table")
data class Comida(
    @PrimaryKey(autoGenerate = true) //autoincrement
    val id: Int,
    val nome: String,
    val descricao: String
):Parcelable