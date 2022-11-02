package com.example.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.main.Adapters.UserAdapter

class List_people : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_people)
        val listView = findViewById<ListView>(R.id.recipe_list_view)
        val userList = MyApplication.database?.userDao()?.getAll();
        if (userList != null) {
            val adapter = UserAdapter(this, userList);
            listView.adapter = adapter;
        }

    }
}