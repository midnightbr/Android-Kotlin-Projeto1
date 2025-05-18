package com.learn.androidcompletocursoudemy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var btnOpen: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnOpen = findViewById(R.id.btnTelaSorteio)
        btnOpen.setOnClickListener {
            /**
             * Passando o contexto e a classe de destino da tela que será aberta.
             * Note que para passar a classe resposanvel pela tela, é utilizado
             * após o nome da classe "::class.java".
             */
            val intent = Intent(this, SorteioActivity::class.java)

            // Iniciar uma activity/tela de sorteio
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}