package data

class Cars(paramBrand:String, paramName:String, paramColor:String="balck") {
    var brand: String = paramBrand
    var name: String = paramName
    var color: String = paramColor
    init {
        println("Car $brand $name $color")
    }

}