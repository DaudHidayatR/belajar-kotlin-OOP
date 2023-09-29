package data

class Person {
    var firstName: String = ""
    var middleName: String? = null
    var lastName: String = ""

    fun sayHello(name: String) {
        println("Hello $name, my name is $firstName")
    }
    fun getFullName(): String {
        return "$firstName $middleName $lastName"
    }
}