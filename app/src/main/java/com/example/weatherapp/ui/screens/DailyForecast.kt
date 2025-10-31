package com.example.weatherapp.ui.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.layout.ContentScale
import coil.compose.AsyncImage

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

        items(weatherStuff?.forecast!!.days) { item ->
            Text(
                text = "${item.date} \n ${item.day.condition.text}",
                fontSize = 28.sp
            );

            AsyncImage(
                model = "https:" +  item.day.condition.icon.replace("64x64","128x128"),
                contentDescription = "Weather image",
                modifier = Modifier.size(192.dp),
                contentScale = ContentScale.Crop
            )

            Text(
                text = "Temperature: ${item.day.avgTempC}\n\nPrecipitation: ${item.day.precipMM}MM\n\nHumidity: ${item.day.avghumidity}\n\nWind: ${item.day.windKPH}KPH",
                fontSize = 24.sp,
            )

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