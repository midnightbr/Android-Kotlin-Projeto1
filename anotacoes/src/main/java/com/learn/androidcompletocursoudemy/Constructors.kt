package com.learn.androidcompletocursoudemy

class UserInit constructor(name: String, lastName: String) { //Construtor primário
    var name: String = ""
    var lastName: String = ""

    /**
     * Como a classe está utilizando o construtor para obter os valores iniciais,
     * utiliza-se o init para que os valores recebidos sejam passados
     * para as variaveis da classe
     */
    init {
        this.name = name
        this.lastName = lastName
        println("$name $lastName")
    }
}

/**
 * Essa é uma forma mais direta e simplificada de utilizar construtores,
 * no qual já é definido a variavel dentro do constructor quanto a variavel
 * da classe, ou seja, a classe User é igual a classe UserInit.
 */
class User (
    var name: String,
    var lastName: String
) {
    init {
        println("$name $lastName")
    }
}

/**
 * Sobrecarga de construtores
 */
class OverradeConstructor (
    var number: Number,
    var text: String
) {
    /**
     * É obrigatorio no Kotlin que o construtor secundario chame o construtor
     * primario, conforme está feito no exemplo abaixo,
     * passando os valores recebidos para o construtor primario.
     * Caso seja respeitado, havera um erro no código e não conseguira compilar ou executar.
     */
    constructor(text: String): this(0, text) {
        println("Sobrecarga de Constructor: $text, $number")
    }

    /**
     * Observação: A ordem de execução nesses casos são:
     * 1 - Construtor primario
     * 2 - Init
     * 3 - Construtor secundario.
     */
}

class Init {
    /**
     * O Init é utilizado para executar ou passar valor para algo,
     * como também para executar alguma ação
     * assim que o objeto é instanciado, com ou sem construtor
     */
    init {
        println("Classe instanciada!")
    }
}

fun main() {
    val user = User("John", "177")
    val userInit = UserInit("Bryan", "OConnor")
    val overConst = OverradeConstructor("Construtor secundario")
    val init = Init()
}