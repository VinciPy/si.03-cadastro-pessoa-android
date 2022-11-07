package com.example.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ListView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.main.Adapters.UserAdapter

class List_people : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_people)
        val listView = findViewById<RecyclerView>(R.id.recyclerViewUser)
        val userList = MyApplication.database?.userDao()?.getAll();
        if (userList !== null) {
            Log.i("DATABASE","render")
            val adapter = UserAdapter(this, userList);
            listView.adapter = adapter;
            listView.layoutManager = LinearLayoutManager(this);
        }

    }
}