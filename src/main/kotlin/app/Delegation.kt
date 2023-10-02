package app

import data.MyBase
import data.myBaseDelegate

fun main() {
    val base = MyBase()
    base.sayHello("daud")
    val baseDelegate = myBaseDelegate(base)
    baseDelegate.sayHello("daud")
}