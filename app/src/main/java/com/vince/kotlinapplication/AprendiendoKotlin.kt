package com.vince.kotlinapplication

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


data class Cursos(val nombre: String, val url: String)

class AprendiendoKotlin : Activity() {

    val react = Cursos("React", "react")
    val kotlin = Cursos("Kotlin", "kotlin")
    val movil = Cursos("Movil", "movil")
    var cursoActual = react.copy()

    fun verEnPantalla(mensaje: String): Unit{
        val txt = findViewById<TextView>(R.id.mensaje)
        txt.text = mensaje
    }

    fun switchCurso(curso: Cursos){
        cursoActual = curso.copy()
        when(curso.url){
            "react" -> cursoActual = kotlin.copy()
            "kotlin" -> cursoActual = movil.copy()
            "movil" -> cursoActual = react.copy()
            else -> println("Esto no debe pasar!")
        }
        verEnPantalla("Curso de ${cursoActual.nombre} en platzi.com/${cursoActual.url}")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aprendiendo_kotlin)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            switchCurso(cursoActual)
        }

        button.text = todosLosCursos()
    }

    fun todosLosCursos(): String = "${react.nombre} ${kotlin.nombre} y ${movil.nombre}"
}
