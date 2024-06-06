package com.example.projeto_2.DAO


import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.projeto_2.model.Usuarios

@Database(entities = [Usuarios::class], version = 1)
abstract class UsuariosDb : RoomDatabase() {

    abstract fun usuariosDao(): UsuariosDao

    companion object {
        private lateinit var instancia: UsuariosDb

        fun getBancoDeDados(context: Context): UsuariosDb {
            instancia = Room
                .databaseBuilder(
                    context,
                    UsuariosDb::class.java,
                    name = "db_usuarios"
                )
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build()

            return instancia
        }
    }
}