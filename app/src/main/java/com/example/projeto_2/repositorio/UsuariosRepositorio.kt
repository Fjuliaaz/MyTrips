package com.example.projeto_2.repositorio

import android.content.Context
import androidx.room.Dao
import com.example.projeto_2.DAO.UsuariosDb
import com.example.projeto_2.model.Usuarios

    class UsuariosRepositorio(context : Context) {
        public val db = UsuariosDb.getBancoDeDados(context).usuariosDao()

        fun salvar(usuarios: Usuarios): Long{
            return db.salvar(usuarios)
        }

        fun validaLogin(email:String, senha:String): Boolean {
            return db.logar(email, senha)
        }

        //fun verificarCredenciais(email: String, senha: String): Boolean {
          //  val usuario = Dao.buscarUsuarioPeloEmail(email)
          //  return usuario != null && usuario.senha == senha
    }
