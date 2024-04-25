package com.example.projeto_2.repositorio

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.example.projeto_2.R
import com.example.projeto_2.model.Viagem
import java.time.LocalDate

class ViagemRepositorio {

    class ViagemRepository {

        @Composable
        fun listarTodasAsViagens(): List<Viagem>{

            val londres = Viagem(
                id = 1,
                destino = "Londres",
                descricao = "Londres, capital da Inglaterra e do Reino Unido",
                datChegada = LocalDate.of(2019,2,18),
                datPartida = LocalDate.of(2019,2,21),
                image = painterResource(id = R.drawable.londres)
            )

            val Roma = Viagem(
                id = 2,
                destino = "Roma",
                descricao = "Roma, a capital da Itália, é uma cidade cosmopolita,",
                datChegada = LocalDate.of(2020,6,10),
                datPartida = LocalDate.of(2020,6,21),
                image = painterResource(id = R.drawable.roma)
            )

            val Lisboa = Viagem(
                id = 2,
                destino = "Lisboa",
                descricao = "Lisboa é a capital de Portugal, situada na costa.",
                datChegada = LocalDate.of(2020,11,6),
                datPartida = LocalDate.of(2020,11,20),
                image = painterResource(id = R.drawable.lisboa)
            )

            val Vaticano  = Viagem(
                id = 2,
                destino = "Vaticano",
                descricao = "A Cidade do Vaticano, uma cidade-estado cercada por Roma, Itália,",
                datChegada = LocalDate.of(2023,5,20),
                datPartida = LocalDate.of(2023,6,5),
                //image = painterResource(id = R.drawable.vaticano)
            )

            val Madri  = Viagem(
                id = 2,
                destino = "Madri",
                descricao = "Madri, a capital da Espanha, situada no centro do país.",
                datChegada = LocalDate.of(2025,1,17),
                datPartida = LocalDate.of(2025,2,2),
                // image = painterResource(id = R.drawable.madri)
            )

            return listOf(londres,Roma, Lisboa, Vaticano, Madri)
        }

    }

    }