package data

import annotation.NotBlank

data class CreateProductRequest (
    @NotBlank val Id:String,
    @NotBlank val Name:String,
    @NotBlank val Price:Long)
data class CreateProductResponse (
    @NotBlank val Id:String,
    @NotBlank val Name:String,
    @NotBlank val Price:Long)