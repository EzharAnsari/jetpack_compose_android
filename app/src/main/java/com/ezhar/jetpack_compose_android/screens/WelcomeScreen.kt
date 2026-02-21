package com.ezhar.jetpack_compose_android.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ezhar.jetpack_compose_android.R

@Composable
fun WelcomeScreen(modifier: Modifier = Modifier) {

    val gradientBrush = Brush.verticalGradient(
        colors = listOf(
            Color(0xFF1B8E3E),   // Deep Green
            Color(0xFF34C759),   // Fresh Green
            Color(0xFFFFA726),   // Soft Orange
            Color(0xFFFF6F00)    // Deep Orange
        )
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.65f)
                .background(
                    brush = gradientBrush
                ),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .size(280.dp)
                    .background(
                        color = Color.White.copy(alpha=0.1f),
                        shape = CircleShape
                    ),
                contentAlignment = Alignment.Center

            ) {
                Image(
                    painter = painterResource(R.drawable.fruit_basket_image),
                    contentDescription = "Fruit baskter image",
                    modifier = Modifier.size(160.dp)
                )
            }
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.35f)
                .padding(horizontal = 24.dp, vertical = 32.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Column(horizontalAlignment = Alignment.CenterHorizontally) {

                Text(
                    text = "Get The Freshest Fruit Salad Combo",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF272140),
                    textAlign = TextAlign.Center,
                    lineHeight = 28.sp
                )

                Spacer(modifier= Modifier.height(16.dp))

                Text(
                    text = "We Deliver The Best Freshest Fruit Salad In Town. Order For Combo Today!!!",
                    fontSize = 16.sp,
                    color = Color(0xFF50577E),
                    textAlign = TextAlign.Center,
                    lineHeight = 24.sp
                )

                /*Text(
                    text = "We Deliver The Best Freshest Fruit Salad In Town. Order For Combo Today!!!",
                    fontSize = 16.dp,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFF50577E),
                    textAlign = TextAlign.Center,
                    lineHeight = 24.sp
                )*/

                Spacer(modifier= Modifier.height(26.dp))

                Button(
                    onClick = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFFF6F00)
                    ),
                    shape = RoundedCornerShape(16.dp)
                ) {
                    Text(
                        text = "Let's Continue",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        lineHeight = 28.sp
                    )
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun WelcomeScreenPrev(modifier: Modifier = Modifier) {
    WelcomeScreen()
}