package com.example.weatherapp.ui.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.R
import java.util.Date

@Composable
fun DailyForecast() {

    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        item {
            Spacer(Modifier.height(48.dp))
        }

        // DAY 1
        item {
            Text(
                text = "Weather for 9/25 is Sunny",
                fontSize = 28.sp,
            )
        }
        item {
            Image(
                painter = painterResource(R.drawable.sun_image),
                contentDescription = "Weather Photo"
            )
        }
        item {
            Text(
                text = "Temperature: 8-20C\n\nPrecipitation: 0% 0mm\n\nHumidity: 20%\n\nWind: 11kph NW",
                fontSize = 24.sp,
            )
        }
        item {
            HorizontalDivider(
                modifier = Modifier
                    .padding(horizontal = 40.dp, vertical = 18.dp)
                    .clip(RoundedCornerShape(50)),
                color = Color.Blue,
                thickness = 6.dp
            )
        }

        // DAY 2
        item {
            Text(
                text = "Weather for 9/26 is Cloudy",
                fontSize = 28.sp,
            )
        }
        item {
            Image(
                painter = painterResource(R.drawable.cloudy_image),
                contentDescription = "Weather Photo"
            )
        }
        item {
            Text(
                text = "Temperature: 5-18C\n\nPrecipitation: 0% 0mm\n\nHumidity: 17%\n\nWind: 18kph SE",
                fontSize = 24.sp,
            )
        }
        item {
            HorizontalDivider(
                modifier = Modifier
                    .padding(horizontal = 40.dp, vertical = 18.dp)
                    .clip(RoundedCornerShape(50)),
                color = Color.Blue,
                thickness = 6.dp
            )
        }

        // DAY 3
        item {
            Text(
                text = "Weather for 9/27 is Rain",
                fontSize = 28.sp,
            )
        }
        item {
            Image(
                painter = painterResource(R.drawable.rain_image),
                contentDescription = "Weather Photo"
            )
        }
        item {
            Text(
                text = "Temperature: 7-16C\n\nPrecipitation: 90% 10-15mm\n\nHumidity: 85%\n\nWind: 20kph E",
                fontSize = 24.sp,
            )
        }
        item {
            HorizontalDivider(
                modifier = Modifier
                    .padding(horizontal = 40.dp, vertical = 18.dp)
                    .clip(RoundedCornerShape(50)),
                color = Color.Blue,
                thickness = 6.dp
            )
        }
    }
}