package app

import data.Person

fun main() {
    val daud = Person()
    daud.firstName = "Daud"
    daud.middleName = "Hidayat"
    daud.lastName = "Ramadhan"
    daud.sayHello("daud")
    daud.sayHello("daud", "ramadhan")
}