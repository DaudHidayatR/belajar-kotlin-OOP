package data

open class Teacher(val name:String){
    private fun teach(){
        println("I am teaching")
    }
    protected fun doResearch(){
        println("I am doing research")
    }
}
class SuperTeacher(name:String):Teacher(name){
    fun test(){
        super.doResearch()
    }
}