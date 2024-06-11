package com.example.ec01_jose


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CalcularPromedioNotasScreen() {
    var nota1 by remember { mutableStateOf("") }
    var nota2 by remember { mutableStateOf("") }
    var nota3 by remember { mutableStateOf("") }
    var nota4 by remember { mutableStateOf("") }
    var resultado by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Promedio Notas IDAT",
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth(),
            style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 30.sp)
        )
        OutlinedTextField(
            value = nota1,
            onValueChange = { nota1 = it.filter { it.isDigit() } },
            label = { Text("Nota 1") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = nota2,
            onValueChange = { nota2 = it.filter { it.isDigit() } },
            label = { Text("Nota 2") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = nota3,
            onValueChange = { nota3 = it.filter { it.isDigit() } },
            label = { Text("Nota 3") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = nota4,
            onValueChange = { nota4 = it.filter { it.isDigit() } },
            label = { Text("Nota 4") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                val notas = mutableListOf<Float>()
                nota1.toFloatOrNull()?.let { notas.add(it) }
                nota2.toFloatOrNull()?.let { notas.add(it) }
                nota3.toFloatOrNull()?.let { notas.add(it) }
                nota4.toFloatOrNull()?.let { notas.add(it) }

                if (notas.size >= 3) {
                    val minNota = notas.minOrNull()!!
                    notas.remove(minNota)
                    val promedio = (notas[0] * 0.2 + notas[1] * 0.3 + notas[2] * 0.5).toString()
                    resultado = "Promedio de notas: $promedio"
                } else {
                    resultado = "Por favor, ingrese al menos tres notas válidas."
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Calcular Promedio")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = resultado, modifier = Modifier.align(Alignment.Start))
    }
}
