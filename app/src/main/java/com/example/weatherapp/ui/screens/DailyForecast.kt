package com.example.weatherapp.ui.screens


import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DailyForecast() {
    //Currently not in use
    Text(
        text = "Hello from daily forecast!",
        color = Color.Red,
        fontSize = 64.sp,
        modifier = Modifier.padding(32.dp)

    )
}