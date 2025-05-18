package com.learn.androidcompletocursoudemy

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class SorteioActivity : AppCompatActivity() {
    lateinit var btnClose: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sorteio)

        btnClose = findViewById(R.id.btnClose)
        btnClose.setOnClickListener {
            // Fechar tela/activity
            finish()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun random(view: View) {
        val textResult = findViewById<TextView>(R.id.text_result)
        val number = Random.nextInt(51)
        textResult.setText("Resultado: ${number}")
    }
}