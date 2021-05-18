package com.example.covid

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class TabelaCidades(db: SQLiteDatabase) {
    private val db: SQLiteDatabase = db

    fun cria() {
        db.execSQL("CREATE TABLE cidades (_id INTEGER PRIMARY KEY AUTOINCREMENT, nome TEXT NOT NULL )")
    }

}
