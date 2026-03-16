package com.example.navegacaofluxo.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MenuScreen(modifier: Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Blue)
            .padding(32.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Button(
                onClick = {/*TODO*/ },
                colors = ButtonDefaults.buttonColors(
                    Color.White
                ),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Perfil",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp
                )
            }

            Button(
                onClick = {/*TODO*/ },
                colors = ButtonDefaults.buttonColors(
                    Color.White
                ),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Pedidos",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp
                )
            }

            Button(
                onClick = {/*TODO*/ },
                colors = ButtonDefaults.buttonColors(
                    Color.White
                ),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Sair",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp
                )
            }
        }
    }
}
