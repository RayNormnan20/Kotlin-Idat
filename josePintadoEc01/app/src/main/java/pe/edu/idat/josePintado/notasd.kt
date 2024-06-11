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
fun CalcularPromedioNotasScreen() {
    var nota1 by remember { mutableStateOf("") }
    var nota2 by remember { mutableStateOf("") }
    var nota3 by remember { mutableStateOf("") }
    var nota4 by remember { mutableStateOf("") }
    var resultado by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        OutlinedTextField(
            value = nota1,
            onValueChange = { nota1 = it },
            label = { Text("Nota 1") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = nota2,
            onValueChange = { nota2 = it },
            label = { Text("Nota 2") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = nota3,
            onValueChange = { nota3 = it },
            label = { Text("Nota 3") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = nota4,
            onValueChange = { nota4 = it },
            label = { Text("Nota 4") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            val notas = mutableListOf(nota1.toFloat(), nota2.toFloat(), nota3.toFloat(), nota4.toFloat())
            val minNota = notas.minOrNull()
            if (minNota != null) {
                notas.remove(minNota)
                val promedio = (notas[0] * 0.2 + notas[1] * 0.3 + notas[2] * 0.5).toString()
                resultado = "Promedio de notas: $promedio"
            } else {
                resultado = "Error al calcular el promedio."
            }
        }) {
            Text(text = "Calcular Promedio")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = resultado)
    }
}
