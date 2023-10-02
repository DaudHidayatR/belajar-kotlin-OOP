package app

import data.Token

fun main() {
    val token = Token("abc")
    println(token.value)
    println(token.toUpper())
}