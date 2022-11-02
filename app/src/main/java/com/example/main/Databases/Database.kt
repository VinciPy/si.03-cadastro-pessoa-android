package com.example.main.Databases

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.main.DAOs.UserDao
import com.example.main.Entities.User


@Database(entities = [User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    companion object {
        @Volatile
        private var INSTANCE : AppDatabase? = null
        fun getDatabase(context: Context): AppDatabase{
            val tempInstance = INSTANCE
            if(tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "mainDatabase"
                ).allowMainThreadQueries().build()
                INSTANCE = instance
                return instance
            }
        }
    }


    abstract fun userDao(): UserDao
}
