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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.MainViewModel
import com.example.weatherapp.R
import com.example.weatherapp.models.Weather

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CurrentWeather(mainViewModel: MainViewModel) {

    val weatherStuff by mainViewModel.weather.collectAsState()


    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()

    ) {
        //Spacer to bring UI below phone notification bar
        Spacer(
            Modifier.height(height = 48.dp)
        )

        Text(
            text = weatherStuff?.currentWeather!!.weatherStatus,
            fontSize = 28.sp,
        )

        Image(painter = painterResource(R.drawable.sun_image),
            contentDescription = "Weather Photo")

        Text(
            text = "Temperature: ${weatherStuff?.currentWeather!!.temperature}\n\nPrecipitation: ${weatherStuff?.currentWeather!!.precipitation}\n\nWind: ${weatherStuff?.currentWeather!!.windSpeed} ${weatherStuff?.currentWeather!!.windDirection}",
            fontSize = 24.sp,
        )


    }

}
