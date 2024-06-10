package pe.edu.idat.miguelchavez


import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MostrarNumerosPares() {
    val numerosPares = (10..20).filter { it % 2 == 0 }.sortedDescending()

    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        for (numero in numerosPares) {
            Text(text = numero.toString())
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}
