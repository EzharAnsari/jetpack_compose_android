package com.ezhar.jetpack_compose_android

import com.ezhar.jetpack_compose_android.R

data class FruitCombo(
    val name: String,
    val price: String,
    val imageRes: Int
)

fun getFruitComboData(): List<FruitCombo> {

    return listOf(
        FruitCombo("Honey Lime Combo", "$100", R.drawable.food_1),
        FruitCombo("Berry Mango Combo", "$75", R.drawable.food_2),
        FruitCombo("Tropical Paradise", "$120", R.drawable.food_4),
        FruitCombo("Citrus Delight", "$85", R.drawable.food_2),
        FruitCombo("Strawberry Blast", "$95", R.drawable.food_1),
        FruitCombo("Green Fresh Mix", "$110", R.drawable.food_4),
        FruitCombo("Summer Special Combo", "$130", R.drawable.food_1),
        FruitCombo("Exotic Fruit Bowl", "$150", R.drawable.food_2),
        FruitCombo("Vitamin C Boost", "$90", R.drawable.food_4),
        FruitCombo("Healthy Choice Combo", "$105", R.drawable.food_2)
    )
}