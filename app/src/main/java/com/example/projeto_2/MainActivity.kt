package com.example.projeto_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.projeto_2.screens.SignUp
import com.example.projeto_2.screens.TelaHome
import com.example.projeto_2.screens.login
import com.example.projeto_2.ui.theme.Projeto2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Projeto2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val controleDeNavegacao = rememberNavController()
                    NavHost(navController = controleDeNavegacao,
                        startDestination = "Login"
                    ){
                        composable(route = "Login"){ login(controleDeNavegacao) }
                        composable(route = "Home"){ TelaHome(controleDeNavegacao) }
                        composable(route = "SignUp"){ SignUp(controleDeNavegacao)}
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Projeto2Theme {

    }
}

