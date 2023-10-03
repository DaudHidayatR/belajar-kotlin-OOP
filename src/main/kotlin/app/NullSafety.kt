package app

data class Friend(val name: String, val age: Int)

fun sayHello(friend: Friend?) {
    val name = friend?.name ?: "Friend"
    val age = friend?.age ?: 0
    println("Hello $name, you're $age years old")
}
fun main() {
    val friend: Friend? = Friend("Adit", 20)
    sayHello(friend)
}