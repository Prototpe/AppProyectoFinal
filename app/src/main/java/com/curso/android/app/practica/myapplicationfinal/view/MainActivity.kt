package com.curso.android.app.practica.myapplicationfinal.view

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.curso.android.app.practica.myapplicationfinal.R
import com.curso.android.app.practica.myapplicationfinal.viewmodel.TextoComparacionViewModel


private lateinit var viewModel: TextoComparacionViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            window.decorView.importantForAutofill =
                View.IMPORTANT_FOR_AUTOFILL_YES
        }


        viewModel = ViewModelProvider(this)[TextoComparacionViewModel::class.java]

        val button: Button = findViewById(R.id.BotonComparacion)
        val ediText1: EditText = findViewById(R.id.Text1)
        val ediText2: EditText = findViewById(R.id.Text2)
        val textView: TextView = findViewById(R.id.Resultado)

        button.setOnClickListener {

            val texto1 = ediText1.text.toString()
            val texto2 = ediText2.text.toString()
            val resultado = viewModel.comparacion(texto1, texto2)

            if (resultado) {
                textView.text = getString(R.string.mensaje_iguales)
            } else {
                textView.text = getString(R.string.mensaje_no_iguales)
            }
        }
    }
}

