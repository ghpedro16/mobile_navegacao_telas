package com.example.navegacaofluxo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideOut
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
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
                        startDestination = "login",
                        exitTransition = {
                            slideOutOfContainer(
                                towards = AnimatedContentTransitionScope.SlideDirection.Left,
                                animationSpec = tween(1000)
                            ) + fadeOut(animationSpec = tween (1000))
                        },
                        enterTransition = {
                            slideIntoContainer(
                                towards = AnimatedContentTransitionScope.SlideDirection.Left,
                                animationSpec = tween (1000)
                            ) + fadeIn(animationSpec = tween(1000))
                        }
                    ){
                        composable (route = "login") { LoginScreen(
                            navController = navController
                        ) }

                        composable (route = "menu") { MenuScreen(
                            navController = navController
                        ) }

                        composable (
                            route = "pedido?numeroPedido={numeroPedido}",
                            arguments = listOf(navArgument("numeroPedido"){
                                defaultValue = "Sem pedidos"
                            })
                        ){
                            val numeroPedido = it.arguments?.getString("numeroPedido")
                            PedidoScreen(
                                navController = navController,
                                numeroPedido = numeroPedido!!
                            )
                        }

                        composable (route = "perfil/{nome}/{idade}",
                            arguments = listOf(
                                navArgument("nome"){
                                    type = NavType.StringType
                                },

                                navArgument("idade"){
                                    type = NavType.IntType
                                }
                            )

                        ){
                            navBackStackEntry ->
                            val nome = navBackStackEntry.arguments?.getString("nome")
                            val idade = navBackStackEntry.arguments?.getInt("idade")
                            PerfilScreen(navController = navController, nome = nome!!, idade!!)
                        }
                    }
                }
            }
        }
    }
}