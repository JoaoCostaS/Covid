package com.example.covid

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class TabelaVacinacao(db: SQLiteDatabase) {
    private val db: SQLiteDatabase = db

    fun cria() {
        db.execSQL("CREATE TABLE vacinacao(id INTEGER PRIMARY KEY AUTOINCREMENT, vacinados INTEGER, naovacinados INTEGER)"
    }
}