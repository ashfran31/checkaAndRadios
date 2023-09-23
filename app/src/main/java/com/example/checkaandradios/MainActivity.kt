package com.example.checkaandradios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var ListaSeleccionados:ArrayList<String> = arrayListOf()
    private lateinit var txtSeleccionado:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtSeleccionado = findViewById<TextView>(R.id.txtSeleccionados)
        val checkRes = findViewById<CheckBox>(R.id.chkRes)
        val checkBar = findViewById<CheckBox>(R.id.chkBar)
        val checkComp = findViewById<CheckBox>(R.id.chkCom)
        val checkVida = findViewById<CheckBox>(R.id.chkVida)

        checkRes.setOnClickListener{

            var myCheck = it as CheckBox

            if(it.isChecked){
                ListaSeleccionados.add(it.text.toString())
            }
            else{
                val indexElemento = ListaSeleccionados.indexOf((it.text.toString()))

                if (indexElemento != -1)
                    ListaSeleccionados.removeAt(indexElemento)
            }
            mostrarSeleccionados()
        }

        checkBar.setOnClickListener{

                var myCheck = it as CheckBox

                if(it.isChecked){
                    ListaSeleccionados.add(it.text.toString())
                    }
                else{
                    val indexElemento = ListaSeleccionados.indexOf((it.text.toString()))

                    if (indexElemento != -1)
                        ListaSeleccionados.removeAt(indexElemento)
                }
                mostrarSeleccionados()
        }

        checkComp.setOnClickListener{

            var myCheck = it as CheckBox

            if(it.isChecked){
                ListaSeleccionados.add(it.text.toString())
            }
            else{
                val indexElemento = ListaSeleccionados.indexOf((it.text.toString()))

                if (indexElemento != -1)
                    ListaSeleccionados.removeAt(indexElemento)
            }
            mostrarSeleccionados()
        }

        checkVida.setOnClickListener{

            var myCheck = it as CheckBox

            if(it.isChecked){
                ListaSeleccionados.add(it.text.toString())
            }
            else{
                val indexElemento = ListaSeleccionados.indexOf((it.text.toString()))

                if (indexElemento != -1)
                    ListaSeleccionados.removeAt(indexElemento)
            }
            mostrarSeleccionados()
        }
    }



    fun mostrarSeleccionados(){
        if(ListaSeleccionados.size > 0) {
            txtSeleccionado.text = ListaSeleccionados.joinToString(" - ", "{ ",  " }")
        }else{
            txtSeleccionado.text = ""
        }
    }
}