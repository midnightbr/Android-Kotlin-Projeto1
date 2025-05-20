package com.learn.androidcompletocursoudemy

import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.learn.androidcompletocursoudemy.serialize.Filme
import com.learn.androidcompletocursoudemy.serialize.Usuario
import kotlin.random.Random

class SorteioActivity : AppCompatActivity() {
    lateinit var btnClose: Button
    lateinit var textName: TextView
    lateinit var textIdade: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sorteio)

        btnClose = findViewById(R.id.btnClose)
        textName = findViewById(R.id.textName)
        textIdade = findViewById(R.id.textIdade)

        // Recuperando valores recebido da tela anterior
        val bundle = intent.extras
        val nome = bundle?.getString("nome")
        val idade = bundle?.getInt("idade")

        // Utilizando o Serializable para recuperar um objeto
        // Obtendo a versão da API SDK do Android do aparalho do usuario
        val usuario = if (Build.VERSION.SDK_INT >= 33) {
            // O método abaixo só funciona apartir da versão API 33 (Android 13)
            bundle?.getSerializable("usuario", Usuario::class.java)
        } else {
            // Método depreciado apartir da versão API 33 (Android 13)
            bundle?.getSerializable("usuario") as Usuario
        }

        // Utilizando o Parcelable para recuperar um objeto
        // Obtendo a versão da API SDK do Android do aparalho do usuario
        val filme = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            // O método abaixo só funciona apartir da versão API 33 (Android 13)
            bundle?.getParcelable("filme", Filme::class.java)
        } else {
            // Método depreciado para versões anteriores da API 33 (Android 13)
            bundle?.getParcelable("filme")
        }

        /**
         * Recomendado utilizar sempre o getParcelable invés do Serializable
         */

        textName.text = "${usuario?.nome} | ${usuario?.idade} anos"
        textIdade.text = "${filme?.nome} | ${filme?.avaliacoes}"

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