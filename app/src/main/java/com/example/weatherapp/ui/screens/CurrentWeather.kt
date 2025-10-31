package com.example.weatherapp.ui.screens

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.weatherapp.MainViewModel
import com.example.weatherapp.R
import java.util.Date
import java.time.LocalDate


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CurrentWeather(mainViewModel: MainViewModel) {

    val weather by mainViewModel.weather.collectAsState()



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

            AsyncImage(
                model = "https:" + weather?.current!!.condition.icon.replace("64x64","128x128"),
                contentDescription = "Weather image",
                modifier = Modifier.size(192.dp),
                contentScale = ContentScale.Crop
            )


            Text(
                text = "Temperature: ${weather?.current!!.tempC}C\n\nPrecipitation: ${weather?.current!!.precipMM}mm\n\nWind: ${weather?.current!!.windKPH}KPH ${weather?.current!!.windDirection}",
                fontSize = 24.sp,
            )
        }

    }

}
