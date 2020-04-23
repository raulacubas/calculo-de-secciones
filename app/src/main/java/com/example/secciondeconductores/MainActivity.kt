package com.example.secciondeconductores

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    var area: Double = 0.000
    var areall: Double = 0.000
    var arealll: Double = 0.000
    var areatotal: Double = 0.000
    var rad1: Double = 0.000
    var rad2: Double = 0.000
    var rad3: Double = 0.000
    var multip: Double = 0.0
    var multipll: Double = 0.0
    var multiplll: Double = 0.0
    var rad21: Double = 0.000
    var rad22: Double = 0.000
    var rad23: Double = 0.000
    var sec1: Double = 0.000
    var sec2: Double = 0.000
    var sec3: Double = 0.000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        area()

    }


    fun area() {
        btnarea.setOnClickListener {


            rad1 =((num1.text.toString().toDouble())/2) // calculo para el radio para diametro 1
            rad21= rad1*rad1                            // radio al cuadrado
            multip = mul1.text.toString().toDouble()       // variable multiplicador 1
            area=(rad21*3.141592*multip)                // area x multiplicador 1


            rad2 =((num2.text.toString().toDouble())/2)
            rad22= rad2*rad2
            multipll = mul2.text.toString().toDouble()
            areall=(rad22*3.141592*multipll)


            rad3 =((num3.text.toString().toDouble())/2)
            rad23= rad3*rad3
            multiplll = mul3.text.toString().toDouble()
            arealll=(rad23*3.141592*multiplll)


            areatotal= area+areall+arealll             // calculo seccion total
            textres.text = areatotal.toString()        // muestra seccion total
            sec1=(rad21*3.141592)
            secalam1.text = sec1.toString()
            sec2=(rad22*3.141592)
            secalam2.text = sec2.toString()
            sec3=(rad23*3.141592)
            secalam3.text = sec3.toString()
        }

    }

}




