package com.example.weatherapp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.weatherapp.models.CurrentWeather
import com.example.weatherapp.models.ForecastWeather
import com.example.weatherapp.models.Weather
import com.example.weatherapp.services.WeatherService
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainViewModel : ViewModel()
{
    private val _weather = MutableStateFlow<Weather?>(null)

    val weather =_weather.asStateFlow()

    val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://api.weatherapi.com/v1/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val weatherService: WeatherService = retrofit.create(WeatherService::class.java)

    fun getWeather(lnglat: String){
        viewModelScope.launch {
            val weather = weatherService.getWeather(
                key = "3a3364f8034e47f48a8174727251510",
                location = lnglat,
                days = "3",
                airQuality = "no",
                alerts = "no",
            )
            _weather.value = weather
        }
    }

}