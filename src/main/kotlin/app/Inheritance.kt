package app

import data.Manager

fun main() {
    val manager = Manager("Daud")
    manager.sayHello("Budi")

    val vicePresident = Manager("Hidayat")
    vicePresident.sayHello("Budi")


}