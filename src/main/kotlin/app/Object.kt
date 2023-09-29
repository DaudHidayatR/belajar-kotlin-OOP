package app

import data.Person

fun main() {

    val daud = Person()
    daud.firstName = "Daud"
    daud.middleName = "Hidayat"
    daud.lastName = "Ramadhan"
    val siraj = Person()
    siraj.firstName = "Muhammad"
    siraj.middleName = "Rizki"
    siraj.lastName = "Siraj"
    val bintang = Person()
    bintang.firstName = "Bintang"
    bintang.middleName = null
    bintang.lastName = "Rahmatullah"

    println(daud.firstName)
    println(siraj.lastName)
    println(bintang.firstName)
}