package app

import data.SuperTeacher
import data.Teacher

fun main() {
    val teacher = SuperTeacher("Daud")
    println(teacher.name)
    teacher.test()
}