package com.example.l2jc

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp





class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {//define o layout da atividade em que as funções de composição são chamadas.
            MessageCard(Message("Android","Jetpack Compose"))//MessageCard recebe um nome e o usa para configurar o elemento de texto.
        }
    }


    data class Message(val author: String, val body: String)//entregam muito mais a partir de um código conciso.
//Um código conciso significa um código ao mesmo tempo breve, significativo e claro, de fácil legibilidade

    @Composable
    fun MessageCard(msg: Message) {
        Row {
            Image(
                painter = painterResource(R.drawable.profile_picture),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    // Set image size to 40 dp
                    .size(40.dp)
                    // Clip image to be shaped as a circle
                    .clip(CircleShape)
            )
            // Add a horizontal space between the image and the column
            Spacer(modifier = Modifier.width(8.dp))
        Column {//permite organizar os elementos verticalmente
        Text(text = msg.author)
        Text(text = msg.body)
        }
    }
  }


    @Preview
    @Composable
    fun PreviewMessageCard() {
        MessageCard(msg = Message("Lexi", "Hey, take a look at Jetpack Compose, it's great!"))
    }




//....


}





