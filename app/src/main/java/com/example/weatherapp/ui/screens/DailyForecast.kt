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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.MainViewModel
import com.example.weatherapp.R
import java.util.Date
import androidx.compose.foundation.lazy.items
@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun DailyForecast(mainViewModel: MainViewModel) {

    val weatherStuff by mainViewModel.weather.collectAsState()


    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        item {
            Spacer(Modifier.height(48.dp))
        }

//        items(weatherStuff?.dailyWeather!!) { item ->
//            Text(
//                text = "Weather for ${item.date} is ${item.weatherStatus}",
//                fontSize = 28.sp
//            );
//            var imageRes = R.drawable.sun_image
//
//
//            if (item.weatherStatus == "Rain"){
//                imageRes = R.drawable.rain_image
//            } else if (item.weatherStatus == "Clouds" || item.weatherStatus == "Overcast"){
//                imageRes = R.drawable.cloudy_image
//            }
//
//            Image(
//                painter = painterResource(imageRes),
//                contentDescription = "Weather Photo"
//            )
//
//            Text(
//                text = "Temperature: ${item.temperature}\n\nPrecipitation: ${item.precipitation}\n\nHumidity: ${item.humidity}\n\nWind: ${item.windSpeed} ${item.windDirection}",
//                fontSize = 24.sp,
//            )
//            HorizontalDivider(
//                modifier = Modifier
//                    .padding(horizontal = 40.dp, vertical = 18.dp)
//                    .clip(RoundedCornerShape(50)),
//                color = Color.Blue,
//                thickness = 6.dp
//            )
//        }



        // DAY 1
//        item {
//            Text(
//                text = "Weather for  is Sunny",
//                fontSize = 28.sp,
//            )
//        }
//        item {
//            Image(
//                painter = painterResource(R.drawable.sun_image),
//                contentDescription = "Weather Photo"
//            )
//        }
//        item {
//            Text(
//                text = "Temperature: ${weatherStuff?.currentWeather!!.temperature}\n\nPrecipitation: ${weatherStuff?.currentWeather!!.precipitation}\n\nWind: ${weatherStuff?.currentWeather!!.windSpeed} ${weatherStuff?.currentWeather!!.windDirection}",
//                fontSize = 24.sp,
//            )
//        }
//        item {
//            HorizontalDivider(
//                modifier = Modifier
//                    .padding(horizontal = 40.dp, vertical = 18.dp)
//                    .clip(RoundedCornerShape(50)),
//                color = Color.Blue,
//                thickness = 6.dp
//            )
//        }
//
//        // DAY 2
//        item {
//            Text(
//                text = "Weather for 9/26 is Cloudy",
//                fontSize = 28.sp,
//            )
//        }
//        item {
//            Image(
//                painter = painterResource(R.drawable.cloudy_image),
//                contentDescription = "Weather Photo"
//            )
//        }
//        item {
//            Text(
//                text = "Temperature: 5-18C\n\nPrecipitation: 0% 0mm\n\nHumidity: 17%\n\nWind: 18kph SE",
//                fontSize = 24.sp,
//            )
//        }
//        item {
//            HorizontalDivider(
//                modifier = Modifier
//                    .padding(horizontal = 40.dp, vertical = 18.dp)
//                    .clip(RoundedCornerShape(50)),
//                color = Color.Blue,
//                thickness = 6.dp
//            )
//        }
//
//        // DAY 3
//        item {
//            Text(
//                text = "Weather for 9/27 is Rain",
//                fontSize = 28.sp,
//            )
//        }
//        item {
//            Image(
//                painter = painterResource(R.drawable.rain_image),
//                contentDescription = "Weather Photo"
//            )
//        }
//        item {
//            Text(
//                text = "Temperature: 7-16C\n\nPrecipitation: 90% 10-15mm\n\nHumidity: 85%\n\nWind: 20kph E",
//                fontSize = 24.sp,
//            )
//        }
//        item {
//            HorizontalDivider(
//                modifier = Modifier
//                    .padding(horizontal = 40.dp, vertical = 18.dp)
//                    .clip(RoundedCornerShape(50)),
//                color = Color.Blue,
//                thickness = 6.dp
//            )
//        }
    }
}