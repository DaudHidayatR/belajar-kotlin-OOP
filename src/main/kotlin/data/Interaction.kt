package data

interface Interaction {
    val name: String
    fun sayHello(name:String)
    val description: String
}
interface Go : Interaction{
    fun go(){
        println("Go")
    }
}
interface MoveA{
    fun move(){
        println("Move A")
    }
}
interface MoveB{
    fun move(){
        println("Move B")
    }
}
class Human(override val name: String) :  Go,MoveA,MoveB, Interaction {
    override fun sayHello(name: String) {
        println("Hello $name, my name is $name")
    }

    override fun move() {
        super<MoveA>.move()
        super<MoveB>.move()
    }
    override val description: String
        get() = "Human"


}