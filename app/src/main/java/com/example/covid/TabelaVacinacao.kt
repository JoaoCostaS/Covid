package com.example.covid

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class TabelaVacinacao(db: SQLiteDatabase) {
    private val db: SQLiteDatabase = db

    fun cria() {
        db.execSQL("CREATE TABLE " + NOME_TABELA + "(" +
                BaseColumns._ID + "INTEGER PRIMARY KEY AUTOINCREMENT," +
                CAMPO_VACINADOS + "INTEGER, " +
                CAMPO_NAOVACINADOS + "INTEGER" +
                ")")
    }
    companion object{
        const val NOME_TABELA = "vacinacao"
        const val CAMPO_VACINADOS = "vacinados"
        const val CAMPO_NAOVACINADOS = "naovacinados"
    }
}