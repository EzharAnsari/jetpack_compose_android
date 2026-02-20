package com.ezhar.jetpack_compose_android

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun Greet(name: String) {
    Text("Hello $name")
}