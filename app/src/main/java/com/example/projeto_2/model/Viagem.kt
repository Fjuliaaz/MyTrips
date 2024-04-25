package com.example.projeto_2.model

import androidx.compose.ui.graphics.painter.Painter
import java.time.LocalDate

data class Viagem(
    //usar var pq val muda o valor, var o usuario pode modificar depois

    var id: Int = 0,
    var destino: String = "",
    var descricao: String = "",
    var datChegada: LocalDate = LocalDate.now(),
    var datPartida: LocalDate = LocalDate.now(),
    var image: Painter? = null

)
