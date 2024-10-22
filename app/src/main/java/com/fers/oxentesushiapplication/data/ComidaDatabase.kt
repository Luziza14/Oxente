package com.example.myapplication.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Comida::class], version = 1, exportSchema = false)
abstract class ComidaDatabase : RoomDatabase() {

    abstract fun ComidaDao(): ComidaDao


    companion object{
        @Volatile
        private var INSTANCE : ComidaDatabase? = null

        /*
        * start(){
        * if (INSTANCE != null){
        *   ------
        * }else{
        *   INSTENCE = new LivroDatabase()
        * }
        * return INSTANCE;
        * }
        * */


        fun getDatabase(context : Context) : ComidaDatabase {
            val tempInstance = INSTANCE
            if(tempInstance != null){
                return tempInstance
            }else{
                synchronized(this){
                    val instance = Room.databaseBuilder(
                        context.applicationContext,
                        ComidaDatabase ::class.java,
                        "comida_table"
                    ).build()

                    INSTANCE =instance
                    return instance
                }

            }
        }
    }

}