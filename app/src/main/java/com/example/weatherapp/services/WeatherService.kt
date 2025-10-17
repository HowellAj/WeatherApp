package com.example.weatherapp.services

import com.example.weatherapp.models.Weather
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


//URL TO REQUEST 10 DAYS WEATHER FOR HALIFAX https://api.weatherapi.com/v1/forecast.json?key=3a3364f8034e47f48a8174727251510&q=Halifax&days=10&aqi=no&alerts=no
interface WeatherService {
    @GET("https://api.weatherapi.com/v1/forecast.json?key=3a3364f8034e47f48a8174727251510&q=Halifax&days=10&aqi=no&alerts=no")
    suspend fun getWeather(): Weather

}