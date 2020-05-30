package com.example.secciondeconductores

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private var area: Double = 0.000
    private var areall: Double = 0.000
    private var arealll: Double = 0.000
    private var areatotal: Double = 0.000
    private var rad1: Double = 0.000
    private var rad2: Double = 0.000
    private var rad3: Double = 0.000
    private var multip: Double = 0.0
    private var multipll: Double = 0.0
    private var multiplll: Double = 0.0
    private var rad21: Double = 0.000
    private var rad22: Double = 0.000
    private var rad23: Double = 0.000
    private var sec1: Double = 0.000
    private var sec2: Double = 0.000
    private var sec3: Double = 0.000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        area()

    }


    private fun area() {
        btnarea.setOnClickListener {

            if (num1.text.isEmpty() || num2.text.isEmpty() || num3.text.isEmpty()) {

                Toast.makeText(
                    applicationContext,
                    "no puede dejar valores vacias para realizar el calculo ",
                    Toast.LENGTH_LONG
                ).show()

            } else {

                areaCalculation()
            }


        }

    }

    private fun areaCalculation() {
        rad1 = ((num1.text.toString().toDouble()) / 2) // calculo para el radio para diametro 1
        rad21 = rad1 * rad1                            // radio al cuadrado
        multip = mul1.text.toString().toDouble()       // variable multiplicador 1
        area = (rad21 * 3.141592 * multip)                // area x multiplicador 1


        rad2 = ((num2.text.toString().toDouble()) / 2)
        rad22 = rad2 * rad2
        multipll = mul2.text.toString().toDouble()
        areall = (rad22 * 3.141592 * multipll)


        rad3 = ((num3.text.toString().toDouble()) / 2)
        rad23 = rad3 * rad3
        multiplll = mul3.text.toString().toDouble()
        arealll = (rad23 * 3.141592 * multiplll)


        areatotal = area + areall + arealll             // calculo seccion total
        textres.text = areatotal.toString()        // muestra seccion total
        sec1 = (rad21 * 3.141592)
        secalam1.text = sec1.toString()
        sec2 = (rad22 * 3.141592)
        secalam2.text = sec2.toString()
        sec3 = (rad23 * 3.141592)
        secalam3.text = sec3.toString()


    }


}




