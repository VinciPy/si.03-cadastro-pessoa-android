package com.example.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.room.Room
import com.example.main.Databases.AppDatabase

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        supportActionBar?.hide();
        val button: Button = findViewById(R.id.bt_Listar);
        button.setOnClickListener {
           val intent: Intent = Intent(applicationContext, List_people::class.java);
            startActivity(intent);
        }
        val buttonCadastro: Button = findViewById(R.id.bt_cadastrar);
        buttonCadastro.setOnClickListener {
            val intent: Intent = Intent(applicationContext, FormCadastro::class.java);
            startActivity(intent);
        }

    }
}