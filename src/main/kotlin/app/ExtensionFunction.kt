package app

import data.Students
import data.hello
import data.upperName

fun main() {
    val student = Students("Daud", 20)
    student.hello()
    println(student?.upperName)
}