package com.example.covid

import android.database.sqlite.SQLiteDatabase

class TabelaCasos (db: SQLiteDatabase) {
    private val db: SQLiteDatabase = db

    fun cria() {
        db.execSQL("CREATE TABLE Casos (_id INTEGER PRIMARY KEY AUTOINCREMENT, Infetados INTEGER, Ativos INTEGER, obitos INTEGER, id_cidades INTEGER NOT NULL, FOREIGN KEY(id_cidades) REFERENCES cidades)")
    }

}
