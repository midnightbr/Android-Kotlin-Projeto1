package com.learn.resources

class UserResources {
    var name = ""
    var lastName = ""
    internal var email = "teste@teste.com"

    fun FullName() {
        println("$name $lastName")
    }

    fun Email() {
        println(email)
    }
}