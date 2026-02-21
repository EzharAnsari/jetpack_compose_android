package com.ezhar.jetpack_compose_android

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LazyColumnExample(modifier: Modifier = Modifier) {
//    LazyColumn {
//        items(count = 100) { index ->
//            Text("count: $index", modifier= Modifier.padding(8.dp))
//        }
//    }

//    LazyRow() {
//        items(count = 10) { index ->
//            Text("count: $index", modifier= Modifier.padding(8.dp))
//
//        }
//    }

    Column(modifier= Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = { }, modifier= Modifier.fillMaxWidth()) {
            Text("Submit")
        }
    }

    // Do not use any hardcode numeric value, use function like fillMaxWidth for responsive design
}

@Composable
@Preview(showSystemUi = true)
fun Prev(modifier: Modifier = Modifier) {
    LazyColumnExample()
}