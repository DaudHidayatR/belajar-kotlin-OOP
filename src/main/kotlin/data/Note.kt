package data

class Note(title: String) {
    var title: String = title
        get() = field
        set(value) {
            if (value.isNotBlank()) {
                field = value
            }else
                println("Invalid title")
        }
}
class BigNote (val title: String){
    val bigTitle: String
        get() = title.toUpperCase()

}