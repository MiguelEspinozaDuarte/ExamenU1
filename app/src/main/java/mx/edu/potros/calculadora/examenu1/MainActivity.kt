package mx.edu.potros.calculadora.examenu1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cc:TextView= findViewById(R.id.etC)
        val cf:TextView= findViewById(R.id.etF)
        val btnGC: Button=findViewById(R.id.btnGC)
        val btnGF: Button=findViewById(R.id.btnGF)

        btnGC.setOnClickListener {
            var gradosF: Double=0.0
            try{
                gradosF=cf.text.toString().toDouble
            } catch (ex: java.lang.Exception){

            }

            var gradosC=convertirGC(gradosF)
            val formatted ="%.2f".format(gradosC)
            cc.setText(formattedNumber)
        }

        btnGF.setOnClickListener {
            var gradosC: Double=0.0
            try{
                gradosC=cc.text.toString().toDouble
            } catch (ex: java.lang.Exception){

            }

            var gradosF=convertirGC(gradosC)
            val formatted ="%.2f".format(gradosC)
        }

        convertirGC(gradosF: Double):Double{
            return (gradosF-32)/1.8
        }
        convertirGF(gradosC: Double):Double{
            return (gradosC*1.8)+32;
        }
    }
}