package com.example.main

import android.app.Application
import androidx.room.Room
import com.example.main.Databases.AppDatabase

open class MyApplication: Application() {

    companion object {
        var database: AppDatabase? = null
    }

    override fun onCreate() {
        super.onCreate()
        database = AppDatabase.getDatabase(this);
    }
}