package com.curso.android.app.practica.myapplicationfinal.viewmodel

import androidx.lifecycle.ViewModel
import com.curso.android.app.practica.myapplicationfinal.model.TextoComparacionModel

class TextoComparacionViewModel : ViewModel() {
    private val model = TextoComparacionModel()

    fun comparacion(texto1: String, texto2: String): Boolean {
        return model.comparacion(texto1, texto2)
    }
}