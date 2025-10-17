package com.example.weatherapp.models


import com.google.gson.annotations.SerializedName
import java.sql.Date

data class Weather(
    val current: CurrentWeather,
    val forecast: ForecastWeather
)

data class CurrentWeather(
    val condition: CurrentCondition,
    @SerializedName("temp_c") val tempC: String,
    @SerializedName("temp_f") val tempF: String,
    @SerializedName("precip_mm") val precipMM: String,
    @SerializedName("precip_in") val precipIN: String,
    @SerializedName("wind_kph") val windKPH: String,
    @SerializedName("windchill_c") val windchillC: String,
    @SerializedName("wind_mph") val windMPH: String,
    @SerializedName("windchill_f") val windchillF: String,
    @SerializedName("wind_dir") val windDirection: String,
    @SerializedName("last_updated") val date: String,
    val humidity: String
)

data class CurrentCondition(
    val text: String,
    val icon: String
)


data class ForecastWeather(
    @SerializedName("forecastday")val days: List<DailyWeather>
)

data class DailyWeather(
    val day: ForecastCondition,
    val date: String
)

data class ForecastCondition(
    val condition: CurrentCondition,
    @SerializedName("avgtemp_c") val avgTempC: String,
    @SerializedName("avgtemp_f") val avgTempF: String,
    @SerializedName("totalprecip_mm") val precipMM: String,
    @SerializedName("totalprecip_in") val precipIN: String,
    @SerializedName("daily_chance_of_rain") val precipChance: String,
    @SerializedName("maxwind_kph") val windKPH: String,
    @SerializedName("wind_mph") val windMPH: String,
    @SerializedName("uv") val uvRating: String,
    val avghumidity: String
)


