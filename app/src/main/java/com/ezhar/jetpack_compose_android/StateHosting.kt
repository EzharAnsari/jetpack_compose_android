package com.ezhar.jetpack_compose_android

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun GoodTextField(text: String, onTextChanged: (String) -> Unit) {

    TextField(
        value = text,
        onValueChange = onTextChanged,
        label = { Text("Enter Text") }
    )
}

@Composable
fun ParentTextField(modifier: Modifier = Modifier) {
    var text by remember { mutableStateOf("") }

    GoodTextField(text = text) {
        text = it
    }
}

@Composable
@Preview(showSystemUi = true)
fun Prev() {
    ParentTextField()
}