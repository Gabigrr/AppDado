package com.generation.appdado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDado1 = findViewById<Button>(R.id.buttonDado1)
        buttonDado1.setOnClickListener {
            Toast.makeText(this, "Rode o dado novamente", Toast.LENGTH_SHORT).show()
            girarDado1(6)

            val buttonDado2 = findViewById<Button>(R.id.buttonDado2)
            buttonDado2.setOnClickListener {
                Toast.makeText(this, "Rode o dado novamente", Toast.LENGTH_SHORT).show()
                girarDado2(12)

                val buttonDado3 = findViewById<Button>(R.id.buttonDado3)
                buttonDado3.setOnClickListener {
                    Toast.makeText(this, "Rode o dado novamente", Toast.LENGTH_SHORT).show()
                    girarDado3(20)

                }
                /* da para fazer sem o toast
                val buttonDado1 = findViewById<Button>(R.id.buttonDado1)

                buttonDado1.setOfClickListener {
                girarDado1(6)
            } */

            }
                /*fun girarDado1(lados: Int) {
                    val valor = (1..lados).random()
                    val result = findViewById<TextView>(R.id.result)

                    result.text = valor.toString()

                }
                           */
        }

            }

    private fun girarDado3(lados: Int) {
        val valor = (1..lados).random()
        val result = findViewById<TextView>(R.id.result)

    }

    private fun girarDado2(lados: Int) {
        val valor = (1..lados).random()
        val result = findViewById<TextView>(R.id.result)

    }

    private fun girarDado1(lados: Int) {
        val valor = (1..lados).random()
        val result = findViewById<TextView>(R.id.result)
    }

    }





