package data

class Application (val name: String) {
    companion object {
        val name: String = "My Utilities"

        fun toUpper(value: String): String {
            return value.toUpperCase()
        }
    }
}