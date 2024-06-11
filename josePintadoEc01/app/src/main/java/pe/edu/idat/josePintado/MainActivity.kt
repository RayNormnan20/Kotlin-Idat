package pe.edu.idat.josePintado

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Spacer
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import java.lang.reflect.Modifier

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

