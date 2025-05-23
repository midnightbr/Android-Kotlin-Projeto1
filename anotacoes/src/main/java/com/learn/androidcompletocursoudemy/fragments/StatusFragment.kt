package com.learn.androidcompletocursoudemy.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.learn.androidcompletocursoudemy.R

class StatusFragment : Fragment() {
    private var categoria: String? = null
    private lateinit var textResult: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(
            R.layout.fragment_status,
            container,
            false
        )
        textResult = view.findViewById(R.id.textResult)
        textResult.text = categoria

        return view
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /**
         * Para obter os dados recebidos da tela anterior, o funcionamento é parecido com
         * o bundle, mais aqui sendo necessario apenas chamar o arguments para obter os dados.
         * Lembre de que você precisa usar o get de acordo com o tipo de objeto.
         */
        categoria = arguments?.getString("categoria")
    }
}