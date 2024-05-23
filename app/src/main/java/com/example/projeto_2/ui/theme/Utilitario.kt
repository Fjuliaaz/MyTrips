package com.example.projeto_2.ui.theme

import java.time.LocalDate

fun diminuirData (dataAntiga : LocalDate) : String {

    val dia = dataAntiga.dayOfMonth
    val mes = dataAntiga.month.toString().substring(0..2)
    return "$dia - $mes"

}