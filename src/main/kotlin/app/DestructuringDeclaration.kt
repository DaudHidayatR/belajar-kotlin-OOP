package app

import data.Game
import data.Login
import data.MinMax

fun displayMinMax(value:Int, value2: Int):MinMax {
    return when {
        value > value2 -> MinMax(value2, value)
        else -> MinMax(value, value2)
    }
}
fun login(login: Login, callback:(Login) -> Boolean): Boolean {
    return callback(login)
}
fun main() {
    val game = Game("Game Unity", 100000)
//    val name = game.name
//    val price = game.price
    val (name, price) = game
    println(name)
    println(price)
    val(min, max) = displayMinMax(10, 100)
    println(min)
    println(max)

    val login = Login("admin", "admin")
    login(login){(username, password) ->
        username == "admin" && password == "admin"
    }
}