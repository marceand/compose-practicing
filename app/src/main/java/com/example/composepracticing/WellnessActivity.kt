package com.example.composepracticing

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composepracticing.ui.theme.ComposePracticingTheme

class WellnessActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePracticingTheme {
                // A surface container using the 'background' color from the theme
                WellnessApp()
            }
        }
    }
}

@Preview
@Composable
fun WellnessAppPreview(modifier: Modifier = Modifier){
    WellnessApp()
}

@Composable
fun WellnessApp(modifier: Modifier = Modifier){
    Surface(
        modifier = Modifier.fillMaxWidth(),
        color = MaterialTheme.colorScheme.background
    ) {
        WellnessScreen()
    }
}

