package data

class Company(var name: String, var address: String){
    override fun equals(other: Any?): Boolean {
        when(other){
            is Company -> return name == other.name && address == other.address
            else -> return false
        }
    }
}