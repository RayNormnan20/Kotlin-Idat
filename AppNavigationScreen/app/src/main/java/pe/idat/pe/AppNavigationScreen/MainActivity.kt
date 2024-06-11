package pe.idat.pe.appnavigationscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Scaffold
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import pe.idat.pe.appnavigationscreen.ui.theme.AppNavigationScreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppNavigationScreenTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "pantallaA") {
                    composable("pantallaA") {
                        PantallaA(navController)
                    }
                    composable("pantallaB") {
                        PantallaB(navController)
                    }
                }
            }
        }
    }
}
