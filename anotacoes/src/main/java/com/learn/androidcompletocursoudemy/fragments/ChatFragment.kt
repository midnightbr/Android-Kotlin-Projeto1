package com.learn.androidcompletocursoudemy.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.learn.androidcompletocursoudemy.R

// Criando um fragment do zero
class ChatFragment : Fragment() {

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