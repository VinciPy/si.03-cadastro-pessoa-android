package com.example.main.Entities
import androidx.room.Entity
import java.util.*

@Entity()
data class User(val name: String, val description: String, val birthday: Date )