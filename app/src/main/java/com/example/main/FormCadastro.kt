
package com.example.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.main.Entities.User

class FormCadastro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_cadastro)
        supportActionBar?.hide();
        val button: Button = findViewById(R.id.ButtonSend);
        button.setOnClickListener {
            val nome: String = findViewById<EditText?>(R.id.Nome_edit).text.toString();
            val descricao: String = findViewById<EditText>(R.id.Descrição_edit).text.toString();
            val dataNascimento: String = findViewById<EditText>(R.id.Data_nascimento_edit).text.toString();
            val user = User(name = nome, description = descricao, birthday = dataNascimento);
            MyApplication.database?.userDao()?.insertAll(user);
            val intent: Intent = Intent(applicationContext, MainActivity::class.java);
            startActivity(intent);
        }
    }
}