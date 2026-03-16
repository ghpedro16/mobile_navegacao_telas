package com.example.navegacaofluxo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navegacaofluxo.screen.LoginScreen
import com.example.navegacaofluxo.screen.MenuScreen
import com.example.navegacaofluxo.screen.PedidoScreen
import com.example.navegacaofluxo.screen.PerfilScreen
import com.example.navegacaofluxo.ui.theme.NavegacaoFluxoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavegacaoFluxoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = ""
                    ){
                        composable (route = "login") { LoginScreen(modifier = Modifier) }

                        composable (route = "menu") { MenuScreen(modifier = Modifier) }

                        composable (route = "pedido") { PedidoScreen(modifier = Modifier) }

                        composable (route = "perfil") { PerfilScreen(modifier = Modifier) }
                    }

                }
            }
        }
    }
}