package app

import data.Manager
import data.VicePresident

fun main() {
    val manager = Manager("Daud")
    manager.sayHello("Budi")

    val vicePresident = VicePresident("Hidayat")
    vicePresident.sayHello("Budi")


}