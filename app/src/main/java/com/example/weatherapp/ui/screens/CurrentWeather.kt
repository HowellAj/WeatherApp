package com.example.weatherapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.R

@Composable
fun CurrentWeather() {



    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()

    ) {
        //Spacer to bring UI below phone notification bar
        Spacer(
            Modifier.height(height = 48.dp)
        )

        Text(
            text = " Weather is currently: Sunny",
            fontSize = 28.sp,
        )

        Image(painter = painterResource(R.drawable.sun_image),
            contentDescription = "Weather Photo")

        Text(
            text = "Temperature: 20C\n\nPrecipitation: 0mm\n\nWind: 11kph NW",
            fontSize = 24.sp,
        )


    }

}
