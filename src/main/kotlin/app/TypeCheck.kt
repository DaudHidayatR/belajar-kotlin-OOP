package app

import data.Customer
import data.SmartPhone

fun printObject(any: Any) {
    if (any is Customer) {
        println("Hello ${any.name}")
    } else if (any is SmartPhone) {
        println("SmartPhone: ${any.name}, ${any.os}")
    } else {
        println(any)
    }
}
fun printString(any: Any) {
    val value = any as String
    println(value)
}
fun printSafe(any: Any) {
    val value = any as? String
    println(value)
}
fun printObjectWithWhen(any: Any) {
    when (any) {
        is Customer -> { println("Hello ${any.name}") }
        is SmartPhone -> { println("SmartPhone: ${any.name}, ${any.os}") }
        else -> { println(any) }
    }
}
fun main() {
    printString("Daud")
//    error
//    printString(1)
    printSafe("Daud")
    printSafe(1)
    printObject(Customer("Daud"))
    printObject(SmartPhone("Samsung", "Android"))


    printObjectWithWhen(Customer("Daud"))
    printObjectWithWhen(SmartPhone("Samsung", "Android"))

}