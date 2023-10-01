package data

class Students (val name: String, val age: Int)
fun Students?.hello(){
    if (this != null) {
        println("Hello $name, your age is $age")
    }
}

