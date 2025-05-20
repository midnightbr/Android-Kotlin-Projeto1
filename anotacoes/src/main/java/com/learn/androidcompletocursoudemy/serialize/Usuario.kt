package com.learn.androidcompletocursoudemy.serialize

import java.io.Serializable

data class Usuario(
    val nome: String,
    val idade: Int,
    val altura: Double,
    val peso: Double
) : Serializable
