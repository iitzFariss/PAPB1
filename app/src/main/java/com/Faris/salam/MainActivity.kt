package com.Faris.salam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.Faris.salam.ui.theme.SalamTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SalamTheme {
                GreetingApp()
            }
        }
    }
}

@Composable
fun GreetingApp() {
    var text by remember { mutableStateOf("") }
    val namaMahasiswa = "Faris Dian Pradipta"

    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = { text = "Halo $namaMahasiswa" },
                modifier = Modifier.padding(16.dp)
            ) {
                Text("Tekan Saya")
            }
            Text(text = text)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SalamTheme {
        GreetingApp()
    }
}
