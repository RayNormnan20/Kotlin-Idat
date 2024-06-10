package pe.edu.idat.miguelchavez

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import pe.edu.idat.miguelchavez.ui.theme.MiguelChavezTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MiguelChavezTheme {
              //  CalcularTarifa()
                //CalcularPromedioNotasScreen()
                VerificarDNI()
            }
        }
    }
}



