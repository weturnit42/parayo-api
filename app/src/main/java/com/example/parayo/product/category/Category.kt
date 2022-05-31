package com.example.parayo.product.category

data class Category(
    val id: Int,
    val name: String
)

val categoryList = listOf(
    Category(0, "전동휠체어"),
    Category(1, "수동휠체어"),
    Category(2, "보행기"),
    Category(3, "지팡이"),
    Category(4, "기저귀"),
    Category(5, "마스크"),
    Category(6, "기타")
)