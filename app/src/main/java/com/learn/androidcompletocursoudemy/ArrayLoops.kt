package com.learn.androidcompletocursoudemy

/**
 * Explicação importante:
 * Mesmo que a variavel seja val, é possivel alterar os valores do itens dentro do array ou objeto,
 * caso o parametros sejam var, já que o val permite alterar as propriedades internas, mas
 * não permite alterar o objeto completo, ou seja, criar um novo objeto na variavel.
 */
fun main() {
    val nomes = arrayOf(
        "Teste", "Array", "Kotlin"
    )
    println(nomes[0])

    nomes[0] = "Mudei string"
    println(nomes[0])

    // While
    var number = 0
    while (number < 3) {
        println(nomes[number])
        number++
    }

    // For
    number = 0
    for (number in 0..2) {
        println("Executando $number")
    }

    for (nome in nomes) {
        println(nome)
    }

    for ((index, nome) in nomes.withIndex()) {
        println("$index: $nome")
    }
}