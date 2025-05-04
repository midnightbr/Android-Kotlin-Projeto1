package com.learn.androidcompletocursoudemy

/**
 * Nas condicionais, temos os tradicionais if, else if e else que existe em
 * outras linguagens, além do when que seria o mesmo que o switch case do C#/Java,
 * com uma estrutura um pouco simplificada e direta.
 * Além disso, tanto nas condicionais if quanto no when, é possivel utilizar
 * do termo `in`, que possibilita você adicionar uma `lista de valores` sequenciais,
 * que, caso o valor esteja dentro desse intervalo, o retorno da condicional será true.
 */
fun main() {
    val opcao = 6

    if(opcao == 1) {
        println("Status")
    } else if (opcao == 3) {
        println("Logs")
    } else if(opcao == 6) {
        println("Exit")
    } else {
        println("Nenhuma opcao selecionada")
    }

    if (opcao in 1..2) {
        println("Opcoes selecionadas: 1 ou 2")
    } else if (opcao in 3..6) {
        println("Opcoes selecionadas: 3, 4, 5 ou 6")
    }

    when(opcao) {
        1 -> println("Opcao 1 selecionada")
        in 2..4 -> println("Opcoes 2, 3 ou 4 selecionadas")
        5 -> println("Opcao 5 selecionada")
        else -> println("Nenhuma opcao selecionada")
    }
}