package com.example.projeto_2.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.projeto_2.screens.SignUp
import com.example.projeto_2.screens.Login
import com.example.projeto_2.screens.TelaHome

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme{
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    val controleDeNavegacao = rememberNavController()

                    NavHost(navController = controleDeNavegacao, startDestination = "cadastro"){
                        composable("login") { Login(controleDeNavegacao) }
                        composable("cadastro"){ SignUp(controleDeNavegacao)}
                        composable("home"){ TelaHome(controleDeNavegacao) }
                    }
                }
            }
        }
    }
}