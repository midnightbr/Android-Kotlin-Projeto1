package com.learn.androidcompletocursoudemy

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

/**
 * Métodos de ciclo de vida de uma activity.
 * Eles são configuraveis por activity, ou seja, a cada tela
 * temos a opções de configura-los para atender a nessecidade de cada tela.
 */

class MainActivity : AppCompatActivity() {
    lateinit var btnOpen: Button

    /**
     * O onCreate() é o primeiro método a ser chamado, responsável pela criação da
     * activity e é executado uma só vez, até a Activity ser destruída. É nessa etapa que
     * são realizados configurações que precisem ser executadas uma única vez, ex:
     * criação de Layouts
     * Após o onCreate() concluir sua execução, o sistema chama o método onStart()
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("ciclo_vida", "onCreate")
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

    /**
     * O onStart() é executado logo após o onCreate() e define que a activity
     * está em processo de inicialização, tornando a activity visível para o usuário.
     * Esse método é executado rapidamente e, finalizada essa etapa a Activity passa
     * para a próxima etapa.
     */
    override fun onStart() {
        super.onStart()
        Log.i("ciclo_vida", "onStart")
    }

    /**
     * O método onResume() é o que efetivamente deixa o Aplicativo pronto para uso,
     * permitindo interação com o usuário. Nesse estado é possível também ativar funcionalidades
     * que precise operar, por exemplo iniciar a câmera.
     * Nesse estado, a Activity fica na parte superior da pilha de navegação e captura toda
     * interação com o usuário, ficando nesse estado até que o usuário sai da tela.
     */
    override fun onResume() {
        super.onResume()
        Log.i("ciclo_vida", "onResume")
    }

    /**
     * Agora se o usuário estiver usando o App e receber uma ligação telefônica a Activity não
     * estará mais 100% em foco para o usuário, a ligação irá sobrepor o App e
     * o método onPause() é chamado e estando nesse estado, poderá seguir dois caminhos possíveis:
     * 1) onStop(), caso fique totalmente invisível para o usuário ou
     * 2) onResume(), caso volte ao foco.
     */
    override fun onPause() {
        super.onPause()
        Log.i("ciclo_vida", "onPause")
    }

    /**
     * O método onStop() é chamado quanto a Activity fica completamente invisível para o usuário,
     * nesse estado o aplicativo pode liberar ou ajustar recursos que não precisam estar
     * disponíveis enquanto a Activity não estiver visível, por exemplo pausar vídeo, animações,
     * processamento que não será necessário caso o usuário não esteja visualizando a tela.
     */
    override fun onStop() {
        super.onStop()
        Log.i("ciclo_vida", "onStop")
    }

    /**
     * Esse método é chamado quanto a Activity sai do estado de pausado onPause() ou de
     * interrompido onStop() e volta a ser utilizada.
     * O método onRestart() é sempre seguido do onStart(), iniciando novamente o ciclo.
     */
    override fun onRestart() {
        super.onRestart()
        Log.i("ciclo_vida", "onRestart")
    }

    /**
     * O método onDestroy() é chamado quanto a Activity será destruída e isso pode acontecer se
     * o usuário encerrar o aplicativo ou quando ocorre uma mudança de configuração
     * como rotação da tela.
     */
    override fun onDestroy() {
        Log.i("ciclo_vida", "onDestroy")
        super.onDestroy()
    }
}