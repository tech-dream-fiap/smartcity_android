package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    fun register(view: View) {
        val email = findViewById<EditText>(R.id.email);
        val pwd = findViewById<EditText>(R.id.pwd);

        val txvResultado = findViewById<TextView>(R.id.register);
        var nome:String = email.editableText.toString()
        txvResultado.text = nome

        print(view);
    }
}