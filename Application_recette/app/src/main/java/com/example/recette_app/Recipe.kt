package com.example.recette_app

import androidx.annotation.DrawableRes


data class Recipe (
    val title: String,
    val category: String,
    val cookingTime: String,
    val energy: String,
    val rating: String,
    val description: String,
    val reviews: String,
    val ingredients: List<Ingredient>
)




data class Ingredient(@DrawableRes val image: Int,
                      val title: String,
                      val subtitle: String)


val fruitSalad = Recipe(
    title = "Fresh Fruits Salad",
    category = "Desserts",
    cookingTime = "30min",
    energy = "700 kcal",
    rating = "4,9",
    description = "This dessert is very tasty, natural and easy to prepare.Also you can replace fruits with another",
    reviews = "50 photos        800 comments",
    ingredients = listOf(
        Ingredient(R.drawable.ananas,"Pineaple", "1"),
        Ingredient(R.drawable.fraise,"Fraise", "200 g"),
        Ingredient(R.drawable.framboise,"Framboise", "450 g"),
        Ingredient(R.drawable.ananas,"Pineaple", "2"),
        Ingredient(R.drawable.fraise,"Fraise", "200 g"),
        Ingredient(R.drawable.framboise,"Framboise", "450 g"),
    )
)

