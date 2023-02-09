package mx.edu.potros.calculadora.examenu1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var etC: EditText
    lateinit var etF: EditText

    val btnGC:Button=findViewById(R.id.btnGC)
    val btnGF:Button=findViewById(R.id.btnGF)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGC.setOnClickListener {
            fun calcularC(etC: Double): Double{
                return (etC-32)/1.8
            }
        }

        btnGF.setOnClickListener {
            fun calcularF(etF: Double): Double{
                return etF*1.8+32
            }
        }

    }
}