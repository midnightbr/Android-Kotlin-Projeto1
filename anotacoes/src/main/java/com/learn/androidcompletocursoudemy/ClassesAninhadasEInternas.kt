package com.learn.androidcompletocursoudemy

class Driver(val name: String) {
    fun showDriverData() = println("Driver name: $name")

    // Classe Aninhada (Nested Class)
    /**
     * Uma classe que seu contexto só faça sentido dentro de outra classe
     */
    class Truck(val model: String) {
        fun showTruckData() = println("Truck model: $model")
    }
}

class Person(val name: String) {
    fun showPersonData() = println("Person name: $name")

    inner class Car(val model: String) {
        fun showCarData() = println("Car model: $model")
        fun showPersonData() = println("Person name: $name")
    }
}

fun main() {
    /**
     * Classes aninhadas tem o mesmo comportamento de criar dois arquivos separados e declarar
     * ambas as classes separadas e não dentro da outra. A unica coisa que muda seria na instancia
     * que precisa chamar a classe Driver primeiro para depois instanciar a classe Truck.
     */
    val driver = Driver("John")
    driver.showDriverData()
    val truck = Driver.Truck("Ford F-150")
    truck.showTruckData()
    // Como pode ser visto, driver não tem acesso as informações de truck e vice-versa.

    /**
     * Já as classes internas (INNER) tem um comportamento diferente,
     * elas tem acesso as informações uma das outras, ou seja,
     * para instanciar Car preciso primeiramente instanciar Person, não apenas
     * chamar como na classe Aninhadas.
     */
    val person = Person("Robert")
    val car = person.Car("Ford Fusion")
    person.showPersonData()
    car.showCarData()

    /**
     * Na minha simples opinião, acho ambos os comportamentos desnecessarios e confusos, além
     * de aumentar a complexidade do código sem nenhuma necessidade.
     * Vou ver na continuidade do curso se vejo a logica e razão para tal comportamento.
     */
}