package com.example.projeto_2.repositorio

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.example.projeto_2.R
import com.example.projeto_2.model.Categoria

class CategoriaRepositorio {

        @Composable
        fun listarCategorias(): List<Categoria> {

            val montain = Categoria(
                1,
                categoria = "Montain",
                imagem = painterResource(id = R.drawable.montanha)
            )

            val snow = Categoria(
                1,
                categoria = "Snow",
                imagem = painterResource(id = R.drawable.esqui)
            )

            val beach = Categoria(
                1,
                categoria = "Beach",
                imagem = painterResource(id = R.drawable.praia)
            )

            return listOf(
                montain,
                snow,
                beach
            )

        }

    companion object {
        fun listarCategorias(current: Context) {

        }
    }
}

