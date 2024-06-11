package com.example.ec01_jose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ec01_jose.ui.theme.Ec01_joseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "menuopciones") {
                composable("menuopciones") { MenuOpciones(navController) }
                composable("Estacion") { CalcularTarifa() }
                composable("promedio") { CalcularPromedioNotasScreen() }
                composable("ValidarDNI") { VerificarDNI() }
                composable("NumerosPares") { MostrarNumerosPares() }
            }
        }
    }
}



