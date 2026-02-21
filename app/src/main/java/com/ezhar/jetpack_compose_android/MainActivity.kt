package com.ezhar.jetpack_compose_android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ezhar.jetpack_compose_android.screens.HomeScreen
import com.ezhar.jetpack_compose_android.screens.SplashScr
import com.ezhar.jetpack_compose_android.screens.WelcomeScreen
import com.ezhar.jetpack_compose_android.ui.theme.Jetpack_compose_androidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            Jetpack_compose_androidTheme {

                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = "SplashScr"
                ) {
                    composable("SplashScr") {
                        SplashScr(navController = navController)
                    }

                    composable("WelcomeScreen") {
                        WelcomeScreen(navController = navController)
                    }

                    composable("HomeScreen") {
                        HomeScreen()
                    }
                }

//                    StateInComposition()
            }
        }
    }
}
