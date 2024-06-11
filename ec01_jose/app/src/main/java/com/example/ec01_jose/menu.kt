package com.example.ec01_jose

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun MenuOpciones(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 25.dp)
    ) {
        Column {
            Text(
                text = "SELECCIONE OPCIONES",
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth(),
                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 30.sp)
            )
            MySpace(16)
            Button(
                onClick = {
                    navController.navigate("Estacion")
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF83B1EF),
                    contentColor = Color.White
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                Text(text = "COBRO ESTACIONAMIENTO",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal
                    )
                )
            }
            MySpace(16)
            Button(
                onClick = {
                    navController.navigate("promedio")
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF83B1EF),
                    contentColor = Color.White
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                Text(text = "PROMEDIO NOTAS",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal
                    )
                )
            }
            MySpace(16)
            Button(
                onClick = {
                    navController.navigate("ValidarDNI")
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF83B1EF),
                    contentColor = Color.White
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                Text(text = "SACAR DNI",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal
                    )
                )
            }
            MySpace(16)
            Button(
                onClick = {
                    navController.navigate("NumerosPares")
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF83B1EF),
                    contentColor = Color.White
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                Text(text = "MOSTRAR PARES",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal)
                )
            }
        }
    }
}

@Composable
fun MySpace(espacio: Int) {
    Spacer(modifier = Modifier.size(espacio.dp))
}
