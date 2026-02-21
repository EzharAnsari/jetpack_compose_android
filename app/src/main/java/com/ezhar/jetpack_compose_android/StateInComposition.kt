package com.ezhar.jetpack_compose_android

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun StateInComposition(modifier: Modifier = Modifier) {
    var count by rememberSaveable { mutableStateOf(0) }

    Column(modifier= Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text("current count: $count")

        Button(onClick = {
            count++
        }) {
            Text("Increment")
        }
    }

    // remember -> remember the value of variable till onCreate lifecycle. Means if onCreate rerun then remember will be reinitialize.
    // rememberSaveable -> remember the value and don't depend on onCreate function. If we rotate the screen value of variable will still be the old one.
}

@Composable
@Preview(showSystemUi = true)
fun Prev() {
    StateInComposition()
}
