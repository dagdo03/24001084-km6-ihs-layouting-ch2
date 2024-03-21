package com.example.challenge2.data.datasource

import com.example.challenge2.R
import com.example.challenge2.data.model.Category

val categoriesData = listOf<Category>(
    Category(image = R.drawable.ic_burger, name = "Burger"),
    Category(image = R.drawable.ic_cake, name = "Cake"),
    Category(image = R.drawable.ic_ramen, name = "Ramen"),
    Category(image = R.drawable.ic_salad, name = "Salad"),
    Category(image = R.drawable.ic_sushi, name = "Sushi"),
    Category(image = R.drawable.ic_steak, name = "Steak"),
    Category(image = R.drawable.ic_pizza, name = "Pizza"),
    Category(image = R.drawable.ic_pasta, name = "Pasta")
)