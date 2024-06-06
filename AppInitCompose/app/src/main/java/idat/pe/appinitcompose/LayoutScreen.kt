package idat.pe.appinitcompose

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import idat.pe.appinitcompose.ui.theme.AppInitComposeTheme



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppInitComposeTheme {
        ejemploRow()
    }
}

@Composable
fun ejemploRow(){
    Row (
        modifier = Modifier
            .fillMaxSize()
            .horizontalScroll(rememberScrollState())
            .padding(top = 70.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Text(
            text = "Hola Mundo, compose",
            modifier = Modifier.width(100.dp)
        )
        Text(
            text = "Hola Mundo, compose",
            modifier = Modifier.width(100.dp)
        )
        Text(
            text = "Hola Mundo, compose",
            modifier = Modifier.width(100.dp)
        )
        Text(
            text = "Hola Mundo, compose",
            modifier = Modifier.width(100.dp)
        )
        Text(
            text = "Hola Mundo, compose",
            modifier = Modifier.width(100.dp)
        )
    }
}

