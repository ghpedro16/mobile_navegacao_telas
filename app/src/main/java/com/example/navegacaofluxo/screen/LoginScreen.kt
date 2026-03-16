package com.example.navegacaofluxo.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
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
fun LoginScreen(modifier: Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.Red)
            .padding(32.dp)
    ){
        Text(
            text = "Login",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp
        )

        Button(
            onClick = {/*TODO*/},
            colors = ButtonDefaults.buttonColors(
                Color.White
            ),
            modifier = modifier.align(Alignment.Center)
        ) {
            Text(
                text = "Entrar",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp
            )
        }
    }
}