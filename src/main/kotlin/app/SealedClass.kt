package app

import data.Minus
import data.Operation
import data.Plus

fun main(value: Int, value2: Int, operation: Operation): Int {
    return when (operation) {
        is Plus -> value + value2
        is Minus -> value - value2
    }
}