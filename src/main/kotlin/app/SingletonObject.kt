package app

import data.Application
import data.Utilities

fun main() {
    println(Utilities.name)
    println(Utilities.toUpper("My Utilities"))
    println(Application.Utilities.toUpper("My Utilities"))
}