package com.example.projeto_2.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.projeto_2.R

@Composable
fun SignUp(controleDeNavegacao: NavHostController) {
    Surface (
        modifier = Modifier.fillMaxSize(),
        color = Color(0xff576583)
    ){
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(
                text = "Bem vindo a Tela de Cadastro!!",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Voltar a tela de Login")

            }
        }

    }

    Column (
        modifier = Modifier.height(800.dp)
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp),
            horizontalArrangement = Arrangement.End
        )
        {
            Box (
                modifier = Modifier
                    .height(50.dp)
                    .background(
                        Color(0xFFB40CCF),
                        shape = RoundedCornerShape(bottomStart = 30.dp),
                    )
                    .width(150.dp),
            ){

            }
        }
        Column (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Sign Up",
                color = Color(0xFFB40CCF),
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Create a new account",
                color = Color(0xFFA09C9C)
            )
        }
        Spacer(modifier = Modifier.height(15.dp))
        Card(
            modifier = Modifier
                .size(height = 100.dp, width = 100.dp)
                .align(alignment = Alignment.CenterHorizontally),
            elevation = CardDefaults.cardElevation(10.dp),
            shape = CircleShape,
            border = BorderStroke(1.dp, Color.Magenta),
        ) {
            Icon(
                modifier = Modifier
                    .fillMaxSize(),
                imageVector = Icons.Filled.Person,
                contentDescription = "",
                tint = Color(0xFFB40CCF)
            )
        }
        Image(
            painter = painterResource(
                id = R.drawable.camera,
            ),
            contentDescription = "Icone de foto",
            modifier = Modifier
                .padding(start = 230.dp)
                .offset(y = -30.dp)
                .size(25.dp)
        )
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp)
                .padding(end = 20.dp),
            value = "Susanna Hoffs",
            onValueChange = {},
            shape = RoundedCornerShape(15.dp),
            label = {
                Text(text = "Username")
            },
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedContainerColor = Color.White,
                focusedContainerColor = Color.White,
                unfocusedBorderColor = Color(0xFFCF06F0),
                focusedBorderColor = Color(0xFFCF06F0)
            ),

            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Person,
                    contentDescription = "",
                    tint = Color(0xFFCF06F0)
                )
            }

        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp)
                .padding(end = 20.dp),
            value = "99999-0987",
            onValueChange = {},
            shape = RoundedCornerShape(15.dp),
            label = {
                Text(text = "Phone")
            },
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedContainerColor = Color.White,
                focusedContainerColor = Color.White,
                unfocusedBorderColor = Color(0xFFCF06F0),
                focusedBorderColor = Color(0xFFCF06F0)
            ),

            )
        Spacer(modifier = Modifier.height(10.dp))
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
        Spacer(modifier = Modifier.height(10.dp))
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
        Spacer(modifier = Modifier.height(13.dp))
        Row(
            modifier = Modifier
                .padding(start = 24.dp, end = 24.dp)
                .align(Alignment.Start)
        ) {
            Row (
                modifier = Modifier
                    .height(30.dp)
                    .width(30.dp)
                    .border(
                        width = 2.dp, color = Color(0xffCF06F0)
                    )
            ){}
            Text(
                text = "Over 18?",
                modifier = Modifier.padding(top = 8.dp, start = 10.dp)
            )
        }
        Spacer(modifier = Modifier.height(13.dp)
        )
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults
                .buttonColors(Color(0xFFB40CCF)),
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
                .padding(start = 20.dp)
                .padding(end = 20.dp),
            shape = RoundedCornerShape(15.dp),
        ) {
            Text(
                text = "CREATE ACCOUNT",
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
                text = "Already have an account?  ",
                color = Color(0xFFA09C9C),
            )
            Text(
                modifier = Modifier.padding(end = 25.dp),
                text = "Sign up",
                color = Color(0xFFB40CCF),
                fontWeight = FontWeight.Bold
            )
        }
        Box (
            modifier = Modifier
                .height(50.dp)
                .width(150.dp)
                .offset(y = 20.dp)
                .background(
                    Color(0xFFCF06F0),
                    shape = RoundedCornerShape(topEnd = 30.dp)
                )
                .padding(top = 90.dp)
        ){
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun SignUpPreview() {}

