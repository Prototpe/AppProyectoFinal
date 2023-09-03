package com.curso.android.app.practica.myapplicationfinal





import org.junit.Test
import org.junit.Assert.assertEquals
import com.curso.android.app.practica.myapplicationfinal.model.TextoComparacionModel



class TextoComparacionModelTest {
        @Test
        fun testComparacion() {
            val model = TextoComparacionModel()
            val resultado = model.comparacion("Hola", "Hola")
            assertEquals(true, resultado)
        }
    }





