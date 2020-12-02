package com.example.prueba_desconecta.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.prueba_desconecta.R

class Asocia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asocia)

        val btn: Button = findViewById(R.id.buttonAsocia)
        btn.setOnClickListener{
            val r = Intent(this, Dibuja::class.java)
            startActivity(r)
        }
    }
}