package data

class Account{
    val name: String by lazy {
        println("Name is initialized")
        "Daud"
    }
}