    package com.example.covid

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Before

    /**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class TestesBaseDados {
    private fun getAppContext() = InstrumentationRegistry.getInstrumentation().targetContext
    private fun getBdCovidOpenHelper() = BdCovidOpenHelper(getAppContext())


    @Before
    fun apagaBaseDados(){
        getAppContext().deleteDatabase(BdCovidOpenHelper.NOME_BASE_DADOS)
    }
    @Test
    fun consegueAbrirBaseDados(){
        val db = getBdCovidOpenHelper().readableDatabase
        assert(db.isOpen)
        db.close()
    }
    @Test
    fun consegueInserirCidades(){
        val db = getBdCovidOpenHelper().writableDatabase
        val TabelaCidades = TabelaCidades(db)

        val id = TabelaCidades.insert(Cidades(nome = "Lisboa").toContentValues())

        Assert.assertNotEquals(-1, id)

        db.close()


    }
}