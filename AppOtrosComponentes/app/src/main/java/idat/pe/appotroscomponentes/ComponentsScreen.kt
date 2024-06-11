package idat.pe.appotroscomponentes

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Slider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
@Composable
fun EjemploRadioButton(nombre: String, onItemSelected: (String) -> Unit) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(6.dp)
        ) {
            RadioButton(
                selected = nombre == "ciclo 1",
                onClick = { onItemSelected("ciclo 1") }
            )
            Text(text = "ciclo 1", Modifier.padding(top = 12.dp))
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(6.dp)
        ) {
            RadioButton(
                selected = nombre == "ciclo 2",
                onClick = { onItemSelected("ciclo 2") }
            )
            Text(text = "ciclo 2", Modifier.padding(top = 12.dp))
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(6.dp)
        ) {
            RadioButton(
                selected = nombre == "ciclo 3",
                onClick = { onItemSelected("ciclo 3") }
            )
            Text(text = "ciclo 3", Modifier.padding(top = 12.dp))
        }
    }
}


@Composable
fun EjemploSlider2(){
    Column(horizontalAlignment = Alignment.CenterHorizontally) {

        var posicion by rememberSaveable {
            mutableStateOf(0f)

        }
        Slider(value = posicion, onValueChange = {posicion = it},
            valueRange = 0f..10f,
            steps = 9)
        Text(text = posicion.toString())
        
    }
}

@Composable
fun EjemploSlider(){
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        var posicion by rememberSaveable {
            mutableStateOf(0f)
        }
        Slider(value = posicion, onValueChange = {posicion = it})
        Text(text = posicion.toString())
    }
}


@Composable
fun EjemploCombo() {
    var texto by rememberSaveable { mutableStateOf("") }
    var expandir by rememberSaveable { mutableStateOf(false) }
    val golosinas = listOf("Chocolates", "Caramelos", "Pastelitos", "Grageas", "Mashmellow")

    Column(Modifier.padding(20.dp)) {
        OutlinedTextField(
            value = texto,
            onValueChange = { },
            enabled = false,
            readOnly = true,
            modifier = Modifier
                .clickable { expandir = true }
                .fillMaxWidth()
        )
        DropdownMenu(
            expanded = expandir,
            onDismissRequest = { expandir = false },
            modifier = Modifier.background(Color.White)
        ) {
            golosinas.forEach { itemGolosina ->
                DropdownMenuItem(
                    text = { Text(text = itemGolosina) },
                    onClick = {
                        expandir = false
                        texto = itemGolosina
                    },
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}


@Composable
fun EjemploCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
            .size(width = 240.dp, height = 100.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White,
            contentColor = Color.Green
        ),
        shape = MaterialTheme.shapes.large,
        border = BorderStroke(1.dp, Color.Blue)
    ) {
        Column(Modifier.padding(16.dp)) {
            Text(text = "Hola Card")
            Text(text = "Hola Card")
            Text(text = "Hola Card")
        }
    }
}

@Composable
fun EjemploDividir() {
    Divider(
        Modifier
            .fillMaxWidth()
            .padding(top = 14.dp),
        color = Color.Red
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ejemploBadgeBox() {

    BadgedBox(
        badge = {
            Badge(
                containerColor = Color.Red,
                contentColor = Color.White
            ) {
                Text(text = "20")
            }
        }, Modifier.padding(16.dp)
    ) {
        Icon(Icons.Filled.Star, contentDescription = "Favoritos")

    }
}



