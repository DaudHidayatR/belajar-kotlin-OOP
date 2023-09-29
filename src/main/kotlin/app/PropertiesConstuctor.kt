package app

import data.User

fun main() {
    val user1 = User("Daud", "123")
    val user2 = User("Siraj", "321")
    println(user1.userName)
    println(user1.password)
    println(user2.userName)
    println(user2.password)

}