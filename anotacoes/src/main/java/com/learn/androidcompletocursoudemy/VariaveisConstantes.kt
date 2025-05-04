package com.learn.androidcompletocursoudemy

/**
 * Diferenças nos tipos de variaveis:
 * val -> imutável, não altera valor (uma constante)
 * var -> mutável, é permitido alterar seu valor.
 */
fun main() {
    val ves = "Nightmare"
    var name = "Nightmare"
    println("Variavel name: $name")
    println("Variavel ves: $ves")
    name = "Beta"
    println("Variavel name: $name")
    println("Variavel ves: $ves")

    /**
     * Qual a diferença entre val do const?
     * val -> precisa saber o valor da constante em tempo de execução
     * const -> é uma variavel global fora de uma func em tempo de compilação, ou seja
     * já precisa saber o valor na compilação
     */
}