package com.example.cartodevisita

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartodevisita.ui.theme.CartãoDeVisitaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartãoDeVisitaTheme {
                CataoDeVisitas()
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun CataoDeVisitas() {
    Box {
        Image(
            painter = painterResource(id = R.drawable.ti),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize(),
            alpha = 0.4F
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxSize()
        ) {
            ApresentacaoPessoal()
            Rodape()
        }
    }
}

@Composable
fun ApresentacaoPessoal() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(top = 150.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.foto),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(150.dp)
                .border(
                    BorderStroke(2.dp, Color.Black),
                    CircleShape
                )
                .padding(2.dp)
                .clip(CircleShape)
        )
        Text(
            text = "Rafael Pinheiro Costa ",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Professor de TI",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.DarkGray
        )
    }
}

@Composable
fun Rodape() {
    Column {
        Contato(
            id = R.drawable.telefone,
            contato = "(11) 95555-5555"
        )
        Contato(
            id = R.drawable.email,
            contato = "xxxxxx@gmail.com"
        )
        Contato(
            id = R.drawable.github,
            contato = "github.com/RafaelPinheiroCosta"
        )
    }
}

@Composable
fun Contato(id: Int, contato: String) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = id),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(40.dp)
                .border(
                    BorderStroke(2.dp, Color.Black),
                    CircleShape
                )
                .padding(2.dp)
                .clip(CircleShape)
        )
        Text(
            text = contato,
            fontSize = 15.sp
        )
    }
    Spacer(modifier = Modifier.size(20.dp))
}