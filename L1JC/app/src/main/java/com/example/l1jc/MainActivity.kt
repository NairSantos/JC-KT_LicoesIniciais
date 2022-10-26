package com.example.l1jc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {//define o layout da atividade em que as funções de composição são chamadas.
           MessageCard("Android")//MessageCard recebe um nome e o usa para configurar o elemento de texto.
        }
    }
}

@Composable//Ela informa ao compilador do Compose que a função é usada para converter dados em IU.
fun MessageCard(name: String) {//MessageCard recebe um nome e o usa para configurar o elemento de texto.
    Text(text = "Hello $name!")//é definida pela biblioteca de IU do Compose mostra um identificador de texto na tela.
}

@Preview//permite visualizar as funções de composição sem criar e instalar o app.
@Composable
fun PreviewMessageCard() {//PreviewMessageCard chama MessageCard com parametro

    MessageCard("Android")//MessageCard recebe um nome e o usa para configurar o elemento de texto.

}