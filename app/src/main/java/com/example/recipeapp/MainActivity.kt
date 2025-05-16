package com.example.recipeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.recipeapp.ui.theme.RecipeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            RecipeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    // ?Change to recipe app, where is the nav
                    RecipeApp(navController = navController)
                }
            }
        }
    }
}

// 1 - create detail screen
// 2 - make column clickable
// 3 - Pass category on CategoryItem (nested)
// 4 - sealed class to list routes
// 5 - Add navigation
// 6 - Receive viewState on recipeApp, we need that for navigation
// 7 - Change main activity to hold NAV
// 8 - Parcelize....