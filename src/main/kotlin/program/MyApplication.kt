package program
import annotation.Fancy
@Fancy(author = "Daud")
class MyApplication (val name: String){
    fun run() {
        println("MyApplication is running")
    }
}