package app

import data.Students

fun main() {
    val students = Students("Aditya", 20)
    println(students.name)
    println(students.age)

    students.let {
        println(it.name)
        println(it.age)
    }
    val result = students.run {
        "Name ${this.name}, Age ${this.age}"
    }
    println(result)

    val result3: Students = students.apply {
        "Name ${this.name}, Age ${this.age}"
    }
    println(result3)

    val result4: Students = students.also {
        "Name ${it.name}, Age ${it.age}"
    }
    println(result4)

    val result5:String = with(students) {
        "Name ${this.name}, Age ${this.age}"
    }
}