package com.learn.androidcompletocursoudemy.serialize

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Filme(
    val nome: String,
    val genero: String,
    val avaliacoes: Double
) : Parcelable
