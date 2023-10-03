package app

import annotation.NotBlank
import data.CreateProductRequest
import java.util.Properties
import kotlin.reflect.full.memberProperties
import kotlin.reflect.full.findAnnotation

fun ValidateRequest(request: Any) {
    val clazz = request::class
    val properties = clazz.memberProperties

    for(property in properties){
        if (property.findAnnotation<NotBlank>() != null){
            val value = property.call(request)
            when(value){
                is String -> {
                    if ("" == value){
                        throw Exception("${property.name} must not be blank")
                    }
                }
            }
        }
    }
}

fun main() {
    val request = CreateProductRequest("1", "Indomie", 1000)
    ValidateRequest(request)
}