package com.ezhar.jetpack_compose_android

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ColumnExample(modifier: Modifier = Modifier) {
//    Column(modifier= Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
//        Text("Hello Friend")
//        Text("Hi Dosto")
//    }

//    Row(modifier= Modifier.fillMaxSize(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
//        Text("Hello Friend")
//        Text("Hi Dosto")
//        Button(onClick = {}) {
//            Text("Click")
//        }
//    }

    Box(modifier= Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(R.drawable.img),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize())
            //modifier= Modifier.width(200.dp).height(200.dp).align(Alignment.Center))

        Text("Overlay Text", color = Color.White, modifier = Modifier.align(Alignment.Center))
    }
}

@Composable
@Preview(showSystemUi = true)
fun ColumnExamplePreivew(modifier: Modifier = Modifier) {
    ColumnExample()
}