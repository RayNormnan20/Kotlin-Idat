package com.example.ec01_jose

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MostrarNumerosPares() {
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(top = 25.dp)) {

        var resultado by rememberSaveable {
            mutableStateOf("")
        }

        Column {
            Text(
                text = "NÚMEROS PARES DEL 20 AL 10 DESCENDENTE",
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth(),
                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 30.sp)
            )
            MySpace(16)

            Button(onClick = {
                resultado = obtenerNumerosPares()
            },
                modifier = Modifier.fillMaxWidth()) {
                Text(text = "MOSTRAR")
            }
            MySpace(espacio = 16)
            Text(
                text = resultado,
                style = TextStyle(fontWeight = FontWeight.Bold, color = Color.DarkGray)
            )
        }
    }
}

fun obtenerNumerosPares(): String {
    val numerosPares = (10..20).filter { it % 2 == 0 }.sortedDescending()
    return numerosPares.joinToString(", ")
}
