package idat.pe.appbasiccomponents

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import idat.pe.appbasiccomponents.ui.theme.AppBasicComponentsTheme



@Composable
fun MiComponenteCompleto(){
    Column(Modifier.fillMaxSize()) {
        Box(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
            .background(Color.Magenta),
            contentAlignment = Alignment.Center)
        {
            Text(text = "Hola Box !!!!")
        }

        Spacer(modifier = Modifier.height(30.dp))
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
            .background(Color.Green)) {
            
            Box(modifier = Modifier.weight(1f).background(Color.Gray).fillMaxHeight(),
                contentAlignment = Alignment.Center){
                Text(text = "Row Box 1")
            }
            Box(modifier = Modifier.weight(1f).background(Color.Red).fillMaxHeight(),
                contentAlignment = Alignment.Center){
                Text(text = "Row Box 1")
            }


        }

        Spacer(modifier = Modifier.height(30.dp))
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
            .background(Color.Yellow)) {

        }
    }
}
@Composable
fun Micaja(){
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center){
        Text(text = "Box Prueba")
    }
}


// Creacion de los contonedores
@Composable
fun MiColumnaPrueba(){
    Column (modifier = Modifier
        .fillMaxSize()
        .padding(top = 80.dp))
    {

        Text(text = "Texto 1", modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center)

        Text(text = "Texto 1", modifier = Modifier
            .fillMaxWidth()
            .background(Color.Blue)
            .height(100.dp), color = Color.White)

        Text(text = "Texto 1", modifier = Modifier.fillMaxWidth())
        Text(text = "Texto 1", modifier = Modifier.fillMaxWidth())
        Text(text = "Texto 1", modifier = Modifier.fillMaxWidth())
        Text(text = "Texto 1", modifier = Modifier.fillMaxWidth())

    }

}