package app

import data.Product

fun main() {
    val product = Product("Widget", 25.00, 100)
    println("Product: ${product.name} " +
            "Price: ${product.price} " +
            "Quantity: ${product.quantity}")
    val product2 = product.copy()
    println(product2)
    println(product)
}