package app

import data.Action

fun fireAction(action: Action) {
    action.action()
}
class SampleAction : Action {
    override fun action() {
        println("action")
    }
}

fun main() {
    fireAction(object : Action {
        override fun action() {
            println("action")
        }
    })
    fireAction(SampleAction())
}