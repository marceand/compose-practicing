package com.example.composepracticing

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    var counter by remember {
        mutableIntStateOf(0)
    }
    Column(modifier = modifier.padding(16.dp)) {

        if (counter > 0) {
            Text(
                text = "You had ${counter} glasses",
            )
        }
        Button(onClick = { counter++ }, modifier = modifier.padding(top = 8.dp)) {
            Text(text = "Add one")
        }
    }

}

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    WaterCounter(modifier)
}