
    package pe.edu.idat.josePintado

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
fun CalcularTarifa() {
    var horas by remember { mutableStateOf("") }
    var minutos by remember { mutableStateOf("") }
    var precioTotal by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        OutlinedTextField(
            value = horas,
            onValueChange = { horas = it },
            label = { Text("Horas") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = minutos,
            onValueChange = { minutos = it },
            label = { Text("Minutos") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            val horasTotales = horas.toFloat() + minutos.toFloat() / 60
            precioTotal = "Total a pagar: S/ ${horasTotales * 1500}"
        }) {
            Text(text = "Calcular Precio")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = precioTotal)
    }
}
