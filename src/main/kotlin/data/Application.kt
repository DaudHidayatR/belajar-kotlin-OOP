package data

class Application (val name: String) {
    object Utilities {
        val name: String = "My Utilities"

        fun toUpper(value: String): String {
            return value.toUpperCase()
        }
    }
}