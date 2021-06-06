package com.example.covid

import android.content.ContentValues

data class Cidades(var id: Long = -1, var nome: String) {
    fun toContentValues(): ContentValues {
        val valores = ContentValues()
        valores.put(TabelaCidades.CAMPO_NOME, nome)

        return valores
    }

}