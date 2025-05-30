package com.learn.androidcompletocursoudemy.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.learn.androidcompletocursoudemy.R

// Criando um fragment do zero
class ChatFragment : Fragment() {

    private lateinit var btnExecute: Button
    private lateinit var editName: EditText
    private lateinit var textResult: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("ciclo_vida", "Fragment onCreateView")

        val view = inflater.inflate(
            R.layout.fragment_chat,
            container,
            false
        )

        btnExecute = view.findViewById(R.id.btnExecute)
        editName = view.findViewById(R.id.editName)
        textResult = view.findViewById(R.id.textResult)

        btnExecute.setOnClickListener {

            /**
             * Esse método mostra uma mensagem no roda da tela, no qual,
             * você defini o tempo de duração com o parâmetro Toast.LENGTH_LONG
             * ou Toast.LENGTH_SHORT.
             */
            Toast.makeText(
                this.context,
                "Sucesso",
                Toast.LENGTH_LONG).show()

            textResult.text = "Olá ${editName.text}"
        }

        return view
    }

    // Ciclo de vida dos Fragmentos
    override fun onAttach(context: Context) {
        Log.i("ciclo_vida", "Fragment onAttach")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("ciclo_vida", "Fragment onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.i("ciclo_vida", "Fragment onViewCreated")
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onStart() {
        Log.i("ciclo_vida", "Fragment onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.i("ciclo_vida", "Fragment onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.i("ciclo_vida", "Fragment onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.i("ciclo_vida", "Fragment onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.i("ciclo_vida", "Fragment onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.i("ciclo_vida", "Fragment onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.i("ciclo_vida", "Fragment onDetach")
        super.onDetach()
    }

}