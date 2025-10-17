package com.example.weatherapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.MainViewModel
import com.example.weatherapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CurrentWeather(mainViewModel: MainViewModel) {

    val weather by mainViewModel.weather.collectAsState()

    mainViewModel.getWeather()

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()

    ) {
        //Spacer to bring UI below phone notification bar
        Spacer(
            Modifier.height(height = 48.dp)
        )

        if (weather !=null) {

            Text(
                text = weather?.current!!.condition.text,
                fontSize = 28.sp,
            )

            Image(
                painter = painterResource(R.drawable.sun_image),
                contentDescription = "Weather Photo"
            )

            Text(
                text = "Temperature: ${weather?.current!!.tempC}\n\nPrecipitation: ${weather?.current!!.precipMM}\n\nWind: ${weather?.current!!.windKPH} ${weather?.current!!.windDirection}",
                fontSize = 24.sp,
            )
        }

    }

}
