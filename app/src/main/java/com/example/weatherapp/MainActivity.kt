package com.example.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.ui.theme.WeatherAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WeatherAppTheme {
                Home()
                //Hello()
            }
        }
    }
}

@Composable
fun Home() {

    Row(horizontalArrangement = Arrangement.Start){
        Text(
            text = "Home!",
            color = Color.Blue,
            fontSize = 24.sp,
            modifier = Modifier.padding(32.dp)

        )

        Text(
            text = "Home 2!",
            color = Color.Blue,
            fontSize = 8.sp,
            modifier = Modifier.padding(32.dp)

        )

        Text(
            text = "Home 3!",
            color = Color.Blue,
            fontSize = 24.sp,
            modifier = Modifier.padding(32.dp)

        )
    }




}

@Composable
fun Hello() {
    //Currently not in use
    Text(
        text = "Hello!",
        color = Color.Red,
        fontSize = 64.sp,
        modifier = Modifier.padding(32.dp)

    )
}

