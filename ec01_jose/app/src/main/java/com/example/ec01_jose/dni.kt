package com.example.ec01_jose


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.util.*

@Composable
fun VerificarDNI() {
    var anoNacimiento by remember { mutableStateOf("") }
    var resultado by remember { mutableStateOf("") }
    var edad by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "RENIEC",
            fontSize = 24.sp,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = anoNacimiento,
            onValueChange = {
                if (it.all { char -> char.isDigit() }) {
                    anoNacimiento = it
                }
            },
            label = { Text("Año de Nacimiento") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                val anoActual = Calendar.getInstance().get(Calendar.YEAR)
                edad = anoActual - anoNacimiento.toInt()
                resultado = if (edad >= 18) {
                    "Debe sacar su DNI. Edad: $edad años."
                } else {
                    "No necesita sacar su DNI aún. Edad: $edad años."
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Verificar DNI")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = resultado, modifier = Modifier.fillMaxWidth())
    }
}
