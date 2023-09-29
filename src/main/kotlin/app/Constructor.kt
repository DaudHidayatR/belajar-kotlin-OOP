package app
import data.Cars
fun main() {
    val toyota = Cars("Toyota", "Avanza", "Black")
    val honda = Cars("Honda", "Jazz", "White")
    val suzuki = Cars("Suzuki", "Ertiga")
    val ferrari = Cars("ferrari")

    println(toyota.brand)
    println(honda.brand)
    println(suzuki.brand)
}