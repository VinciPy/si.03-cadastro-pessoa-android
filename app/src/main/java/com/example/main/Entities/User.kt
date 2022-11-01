package com.example.main.Entities
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import java.time.LocalDate

@Entity(tableName = "user")
data class User(
    @PrimaryKey val uid: String,
    val name: String,
    val description: String,
    @TypeConverters val birthday: String );