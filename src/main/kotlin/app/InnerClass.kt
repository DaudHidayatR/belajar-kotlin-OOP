package app

import data.Boss

fun main() {
    val boss = Boss("daud")
    val employee = boss.Employee("siraj")
    employee.hi()
}