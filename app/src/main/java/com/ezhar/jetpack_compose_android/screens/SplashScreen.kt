package com.ezhar.jetpack_compose_android.screens

import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.ezhar.jetpack_compose_android.R
import kotlinx.coroutines.delay

@Composable
fun SplashScr(navController: NavController) {

    val scale = remember{ Animatable(0f) }

    LaunchedEffect(key1 = true) {
        scale.animateTo(
            targetValue = 0.6f,
            animationSpec = tween(
                durationMillis = 700,
                easing = { it->
                    OvershootInterpolator(4f).getInterpolation(it)
                }
            )
        )

        delay(2000)
        navController.navigate("WelcomeScreen") {
            popUpTo("SplashScr") {
                inclusive = true
            }
        }
    }

    val gradientBrush = Brush.verticalGradient(
//        colors = listOf(
//            Color(0xFF1B8E3E),   // Deep Green
//            Color(0xFF34C759),   // Fresh Green
//            Color(0xFFFFA726),   // Soft Orange
//            Color(0xFFFF6F00)    // Deep Orange
//        )
        colorStops = arrayOf(
            0.0f to Color(0xFF2ECC71),
            0.5f to Color(0xFF66BB6A),
            1.0f to Color(0xFFFF8C00)
        )
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(brush = gradientBrush)
            .scale(scale.value),
        contentAlignment = Alignment.Center,

    ) {

        // Background Image
        /*Image(
            painter = painterResource(R.drawable.img),
            contentDescription = "Splash Screen",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )*/

        // Logo Image (Centered)
        Image(
            painter = painterResource(R.drawable.logo2),
            contentDescription = "Logo",
            modifier = Modifier.size(200.dp)
        )
    }

}

/*
@Composable
@Preview(showBackground = true)
fun SplashScreenPrev(modifier: Modifier = Modifier) {
    SplashScr(modifier)
}*/
