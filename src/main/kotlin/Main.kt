import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

@Composable
fun Titulo() {
    Text("Fake Instagram by Airam")
}

@Composable
fun Historias(modifier: Modifier) {
    Text("Historias")
    Row(modifier) {
        historias.forEach { historia ->
            Box(
                Modifier.size(width = 90.dp, height = 90.dp).padding(top = 15.dp),
            ) {
                Image(
                    modifier = Modifier.clip(CircleShape),
                    painter = painterResource(resourcePath = (historia)),
                    contentDescription = "Fotito"
                )
            }
        }
    }
}

@Composable
fun Publicaciones() {
    Text("Publicaciones")
}

@Composable
fun Sugerencias(modifier: Modifier) {
    Text("Sugerencias")
    Column (
        modifier,
    ){
        Text("Personas que quizas Conozcas")
        sugerencias.forEach{ sugerencia ->
            Row(
                Modifier.padding(top = 20.dp)
            ) {
                Image(
                    modifier = Modifier.clip(CircleShape).size(width = 32.dp, height = 32.dp),
                    painter = painterResource(resourcePath = sugerencia.image),
                    contentDescription = "sugerencia"
                )
                Row(modifier = Modifier.padding(start = 10.dp)) {
                    Text(sugerencia.name)
                    Text(modifier = Modifier.padding(start = 5.dp), text = sugerencia.apellido)
                }
            }
        }
    }
}

@Composable
fun Cuerpo(modifier: Modifier) {
    Row(modifier = modifier) {
        Column(
            modifier = Modifier.padding(start = 25.dp)
        ) {
            Publicaciones()
        }
        Column(
            modifier = Modifier.padding(start = 25.dp, end = 25.dp)
        ) {
            Sugerencias(Modifier.padding(top = 20.dp))
        }
    }
}

@Composable
fun App() {
    Column {
        Titulo()
        Historias(Modifier.padding(start = 15.dp, end = 15.dp))
        Cuerpo(Modifier.fillMaxWidth().padding(top = 30.dp))
    }
}


fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Fake instagram",
        state = rememberWindowState(width = 800.dp, height = 800.dp)
    ) {
        App()
    }
}
