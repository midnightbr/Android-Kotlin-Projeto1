package com.learn.androidcompletocursoudemy

class calculos {
    fun somar(a: Double, b: Double): Double {
        return a + b
    }

    fun subtrair(a: Int, b: Int): Int {
        return a - b
    }
}

fun somar(a: Double, b: Double): Double {
    return a + b
}
/**
 * Na função abaixo é demonstrado como passar uma função para um método/função.
 * Veja que os dois parametros entre parênteses são o tipo função, ou seja, qual tipo de
 * dado ele espera receber, e o tipo de dado que ela retorna.
 */
fun calcular(function: (Double, Double) -> Double) {
    val retorno = function(1.0, 2.0)
    println(retorno)
}

fun teste(function: (Int, Int) -> Int, text: String) {
    val retorno = function(1, 2)
    println(retorno)
    println(text)
}

// Criando função anonima/lambda dentro de uma classe
class Anonima {
    // Retorno Unit significa que a função não retorna nada, ou seja, void
    fun lambdaFunction ( function: () -> Unit) { function() }
    // Função anonima/lambda com diversos parametros
    fun multiVariavel (text: String, function: () -> Unit) {
        function()
        println(text)
    }
}

fun main() {
    // Exemplo de como passar uma função
    calcular(::somar)
    val calculo = calculos()
    // Exemplo de como passar um objeto
    calcular(calculo::somar)

    teste(calculo::subtrair, "Passando mais do que função")
    // Criando a função dentro da chamada do método
    teste({ a, b -> a + b }, "teste")

    // Criando uma função anonima/lambda
    val funcAnonima = {
        println("Função anonima")
    }

    // Criando uma função anonima/lambda com variavel
    val funcAnonimaParam = { name: String ->
        println("Olá $name")
    }

    val anonima = Anonima()
    anonima.lambdaFunction {
        println("Função anonima sendo executada dentro de um método como parametro.")
    }
    // Chamando a função anonima/lambda com varios parametros
    anonima.multiVariavel("Olá Mundo") {
        println("Função anonima sendo executada dentro de um método com varios parametros.")
    }


    // Chamando a função anonima/lambda
    funcAnonima()
    funcAnonimaParam("John")
}