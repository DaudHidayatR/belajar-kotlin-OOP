package app

import data.Company

fun main() {
    val company1 = Company("UII", "kaliurang")
    val company2 = Company("UII", "kaliurang")
    println(company1 == company2)
    println(company1.hashCode())
    println(company2.hashCode())
    println(company1.hashCode()==company2.hashCode())
}