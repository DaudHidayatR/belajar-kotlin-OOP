package app

import exception.ValidationException

fun validateAndSayHello(name: String) {
   if (name.isBlank()){
         throw ValidationException("Name is blank")
    } else {
        println("Hello $name")
    }
}
fun main() {
    try {
        validateAndSayHello("")
    }catch (e: ValidationException) {
        println("Error ${e.message}")
    }catch (e: Throwable) {
        println("Error ${e.message}")
    }finally {
        println("Program selesai")
    }

}