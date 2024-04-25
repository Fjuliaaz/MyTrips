package com.example.projeto_2.model

import androidx.compose.ui.graphics.painter.Painter

data class Categoria(
    var id: Int = 0,
    var categoria: String = "",
    var imagem: Painter? = null
)
