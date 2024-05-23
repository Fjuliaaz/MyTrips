package com.example.projeto_2.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.projeto_2.repositorio.UsuariosRepository

@Composable
fun login(controleDeNavegacao: NavHostController ?) {

    var cnt = UsuariosRepository(LocalContext.current)
    var listarUsuarios = cnt.buscarTodosOsUsuarios()


    var usuarioState = remember {
        mutableStateOf("")
    }

    var emailStat = remember {
        mutableStateOf("")
    }

    var senhaStat = remember {
        mutableStateOf("")
    }

    var mensagemErroStat = remember {
        mutableStateOf("")
    }

    var isErrorState = remember {
        mutableStateOf(false)
    }

    Surface (
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF606464)
    ){
        Column (
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(
                text = "Login",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White)

            Spacer(modifier = Modifier.height(64.dp))
            OutlinedTextField(
                value = emailStat.value,
                onValueChange = {
                    emailStat.value = it
                },
                label = { Text(text = "Email") }
            )
            Spacer(modifier = Modifier.height(64.dp))
            OutlinedTextField(
                value = senhaStat.value,
                onValueChange = {
                    senhaStat.value = it
                },
                label = { Text(text = "Senha") }
            )
            Text(text = mensagemErroStat.value,
                color = Color.Red
            )
            Spacer(modifier = Modifier.height(34.dp))
            Button(onClick = {
                if (emailStat.value == "aluno" && senhaStat.value == "1234"){
                    mensagemErroStat.value = ""
                }else{
                    mensagemErroStat.value = "Email ou Senha incorretos!"
                }
            }) {

                Text(text = "Entrar")
            }
        }
    }

    Column (
        modifier = Modifier.height(800.dp)
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            horizontalArrangement = Arrangement.End
        )
        {
            Box (
                modifier = Modifier
                    .height(50.dp)
                    .background(
                        Color(0xFFA40ABD),
                        shape = RoundedCornerShape(bottomStart = 30.dp)
                    )
                    .width(150.dp),
            ){

            }
        }
        Spacer(modifier = Modifier.height(50.dp))
        Column (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.Start
        ) {
            Spacer(modifier = Modifier.height(100.dp))
            Text(
                modifier = Modifier.padding(start = 30.dp),
                text = "Login",
                color = Color(0xFFCF06F0),
                fontSize = 48.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                modifier = Modifier.padding(start = 30.dp),
                text = "Please sign in to continue.",
                color = Color(0xFFA09C9C)
            )
        }
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp)
                .padding(end = 20.dp),
            value = "teste@gmail.com",
            onValueChange = {},
            shape = RoundedCornerShape(15.dp),
            label = {
                Text(text = "E-mail")
            },
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedContainerColor = Color.White,
                focusedContainerColor = Color.White,
                unfocusedBorderColor = Color(0xFFCF06F0),
                focusedBorderColor = Color(0xFFCF06F0)
            ),

            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Email,
                    contentDescription = "",
                    tint = Color(0xFFCF06F0)
                )
            }

        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp)
                .padding(end = 20.dp),
            value = "*******",
            onValueChange = {},
            shape = RoundedCornerShape(15.dp),
            label = {
                Text(text = "Password")
            },
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedContainerColor = Color.White,
                focusedContainerColor = Color.White,
                unfocusedBorderColor = Color(0xFFCF06F0),
                focusedBorderColor = Color(0xFFCF06F0)
            ),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Lock,
                    contentDescription = "",
                    tint = Color(0xFFCF06F0)
                )
            }
        )
        Spacer(modifier = Modifier.height(30.dp)
        )
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults
                .buttonColors(Color(0xFFB40CCF)),
            modifier = Modifier
                .height(48.dp)
                .width(134.dp)
                .align(Alignment.End)
                .padding(end = 20.dp),
            shape = RoundedCornerShape(15.dp),
        ) {
            Text(
                text = "SIGN IN",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.height(20.dp))
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            Text(
                modifier = Modifier,
                text = "Don’t have an account?  ",
                color = Color(0xFFA09C9C)
            )
            Text(
                modifier = Modifier.padding(end = 25.dp),
                text = "Sign up",
                color = Color(0xFFCF06F0),
                fontWeight = FontWeight.Bold
            )
        }
        Box (
            modifier = Modifier
                .height(50.dp)
                .width(150.dp)
                .offset(y = 75.dp)
                .background(
                    Color(0xFFCF06F0),
                    shape = RoundedCornerShape(topEnd = 30.dp)
                )
                .padding(top = 90.dp)
        ){

        }
    }
}



@Preview(showSystemUi = true, showBackground = true)
@Composable
fun LoginPreview() {
    login(null)
}