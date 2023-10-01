package app

import data.PremiumCustomer

fun main() {
    val premiumConstructor = PremiumCustomer("Daud", 1000)
    println(premiumConstructor.name)

    val premiumFunction = PremiumCustomer("Daud")
    println(premiumFunction.name)
}