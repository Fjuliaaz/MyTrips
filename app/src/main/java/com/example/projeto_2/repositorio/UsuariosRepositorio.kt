package com.example.projeto_2.repositorio

import android.content.Context
import androidx.room.Dao
import com.example.projeto_2.DAO.UsuariosDb
import com.example.projeto_2.model.Usuarios

    class UsuariosRepository(context : Context) {
        public val db = UsuariosDb.getBancoDeDados(context).usuariosDao()

        fun salvar(usuarios: Usuarios): Long{
            return db.salvar(usuarios)
        }

        fun buscarTodosOsUsuarios(): List<Usuarios> {
            return db.listarTodosOsUsuarios()
        }

        fun buscarUsuarioPeloId(id: Long): Usuarios {
            return db.listarUsuarioPeloId(id)
        }

        //fun verificarCredenciais(email: String, senha: String): Boolean {
          //  val usuario = Dao.buscarUsuarioPeloEmail(email)
          //  return usuario != null && usuario.senha == senha
    }
