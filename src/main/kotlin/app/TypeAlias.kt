package app

import data.Application

typealias App = Application
fun main() {
    val app = App("My Application")
    println(app.name)
}