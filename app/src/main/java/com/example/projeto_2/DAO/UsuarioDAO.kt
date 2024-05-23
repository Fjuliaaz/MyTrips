package com.example.projeto_2.DAO

import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.projeto_2.model.Usuarios
@Dao
interface UsuariosDao {

    @Insert
    fun salvar(usuarios: Usuarios) : Long

    @Query("SELECT * FROM tbl_usuarios ORDER BY nome ASC")
    fun listarTodosOsUsuarios(): List<Usuarios>

    @Query("SELECT * FROM tbl_usuarios WHERE :id")
    fun listarUsuarioPeloId(id: Long): Usuarios

    @Query("SELECT * FROM tbl_usuarios WHERE email = :email AND password = :password")
    fun login(email: String, password: String): Usuarios?

}