package com.example.weatherapp
import androidx.lifecycle.ViewModel
import com.example.weatherapp.models.CurrentWeather
import com.example.weatherapp.models.ForecastWeather
import com.example.weatherapp.models.Weather
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel : ViewModel()
{
    private val _weather = MutableStateFlow<Weather?>(null)

    val weather =_weather.asStateFlow()

    init {

        val weatherData = Weather(
            CurrentWeather(
                weatherStatus = "Sunny",
                temperature = "18C",
                precipitation = "0mm",
                windSpeed = "10kph",
                windDirection = "NW",
                humidity = "12%",
                date = "10/5/25",
            ),
            dailyWeather = listOf(
                ForecastWeather(
                    day = 1,
                    date = "10/6/25",
                    weatherStatus = "Rain",
                    temperature = "16C",
                    precipitation = "15mm",
                    windSpeed = "15kph",
                    windDirection = "W",
                    humidity = "100%"
                ),
                ForecastWeather(
                    day = 2,
                    date = "10/8/25",
                    weatherStatus = "Clouds",
                    temperature = "18C",
                    precipitation = "0mm",
                    windSpeed = "8kph",
                    windDirection = "SW",
                    humidity = "21%"
                ),
                ForecastWeather(
                    day = 3,
                    date = "10/9/25",
                    weatherStatus = "Sunny",
                    temperature = "20C",
                    precipitation = "0mm",
                    windSpeed = "21kph",
                    windDirection = "E",
                    humidity = "12%"
                ),
            ),

        )
        _weather.value = weatherData;

    }


}