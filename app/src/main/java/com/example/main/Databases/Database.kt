package com.example.main.Databases

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.main.DAOs.UserDao
import com.example.main.Entities.User

@Database(entities = [User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}