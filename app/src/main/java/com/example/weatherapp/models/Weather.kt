package com.example.weatherapp.models

import android.R.string


data class Weather(
    val currentWeather: CurrentWeather,
    val dailyWeather: List<ForecastWeather>
)

data class CurrentWeather(
    val weatherStatus: String,
    val temperature: String,
    val precipitation: String,
    val windSpeed: String,
    val windDirection: String,
    val humidity: String,
    val date: String

        )

data class ForecastWeather(
    val day: Int,
    val date: String,
    val weatherStatus: String,
    val temperature: String,
    val precipitation: String,
    val windSpeed: String,
    val windDirection: String,
    val humidity: String

)

