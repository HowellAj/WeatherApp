package com.example.weatherapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.R

@Composable
fun CurrentWeather() {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()

    ) {
        Image(painter = painterResource(R.drawable.androidresized),
            contentDescription = "Android")

        Text(
            text = "Home!",
            color = Color.Blue,
            fontSize = 24.sp,
            modifier = Modifier.padding(32.dp)

        )

        Text(
            text = "Home 2!",
            color = Color.Blue,
            fontSize = 8.sp,
            modifier = Modifier.padding(32.dp)

        )

        Text(
            text = "Home 3!",
            color = Color.Blue,
            fontSize = 24.sp,
            modifier = Modifier.padding(32.dp)

        )

    }


}