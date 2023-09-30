package data

open class Shape {
    open val corner : Int = -1
}
class Rectangle : Shape() {
  final override val corner : Int = 4
}