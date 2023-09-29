package data

class Cars(paramBrand:String, paramName:String, paramColor:String="black") {

    constructor(paramBrand:String, paramName:String): this(paramBrand, paramName, "black"){
        println("secondary constructor")
    }

    constructor(paramBrand:String): this(paramBrand, ""){
        println("secondary constructor 2")
    }

    var brand: String = paramBrand
    var name: String = paramName
    var color: String = paramColor

    init {
        println("Car $brand $name $color")
    }


}