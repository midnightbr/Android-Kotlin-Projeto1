package com.learn.androidcompletocursoudemy

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.learn.androidcompletocursoudemy.fragments.CallFragment
import com.learn.androidcompletocursoudemy.fragments.ChatFragment
import com.learn.androidcompletocursoudemy.fragments.StatusFragment

// Componente onde será carregado os fragments
class FragmentActivity : AppCompatActivity() {
    private lateinit var btnStatus: Button
    private lateinit var btnChat: Button
    private lateinit var btnCall: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fragment)

        btnStatus = findViewById(R.id.btnStatus)
        btnChat = findViewById(R.id.btnChat)
        btnCall = findViewById(R.id.btnCall)

        // Iniciando um fragmento na activity
        /*val fragmentManager = supportFragmentManager.beginTransaction()
        fragmentManager.add(R.id.fragmentContent, ChatFragment())
        fragmentManager.commit()*/

        /**
         * Nesse conjunto de chamadas via botões, é utilizado
         * o replace invés do add, justamente porque o add apenas adiciona,
         * ou seja, ira adicionar um novo fragment, enquanto o replace
         * subtituir o fragment que está sendo exibido pelo fragment chamado.
         */
        btnChat.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContent, ChatFragment())
                .commit()
        }

        btnStatus.setOnClickListener {
            // val statusFragment = StatusFragment()
            /**
             * Para activity normais utilizamos o extras para passar informações entre activity`s
             * já os fragments é utilizado o arguments para passar as informações ou objetos
             * entre fragments.
             */
            // O bundleOf abaixo está funcionando da seguinte forma: chave to valor,
            // assim como bundle normal
            // statusFragment.arguments = bundleOf("categoria" to "usuário")

            /*supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContent, statusFragment)
                .commit()*/
            // Utilizando o KTX Jetpack
            /*supportFragmentManager.commit {
                replace(R.id.fragmentContent, statusFragment)
            }*/
            // Forma mais simplificada utilizando o KTX
            val bundle = bundleOf("categoria" to "Ktx Jetpack")
            supportFragmentManager.commit {
                replace<StatusFragment>(
                    R.id.fragmentContent,
                    args = bundle
                )
            }
            /**
             * Com a opção abaixo não é mais necessario ter que estanciar a classe da fragment
             * para passar os valores para ela.
             */
        }

        btnCall.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContent, CallFragment())
                .commit()
        }

        /**
         * Para utilizar o .remove do fragment, você precisa passar a instancia da tela,
         * ou seja, temos duas abordagens para isso. Primeiro seria passar a instancia
         * para uma variavel, assim você inicia e fecha uma instancia do fragment.
         * Já a segunda é fazendo com que esse objeto tenha apenas uma instancia,
         * e quando instanciado novamente, invés de instanciar um novo objeto, ele retorna
         * a instacia existente (Desing Pattern Singleton).
         */

        // Forma simplificada
        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContent, ChatFragment())
            .commit()


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}