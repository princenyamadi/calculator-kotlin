package tech.peny.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }




    fun btnNumberEvent(view: View){
        var btn0 = findViewById<Button>(R.id.btn0)
        var btn1 = findViewById<Button>(R.id.btn1)
        var btn2 = findViewById<Button>(R.id.btn2)
        var btn3 = findViewById<Button>(R.id.btn3)
        var btn4 = findViewById<Button>(R.id.btn4)
        var btn5 = findViewById<Button>(R.id.btn5)
        var btn6 = findViewById<Button>(R.id.btn6)
        var btn7 = findViewById<Button>(R.id.btn7)
        var btn8 = findViewById<Button>(R.id.btn8)
        var btn9 = findViewById<Button>(R.id.btn9)
        var btnAC = findViewById<Button>(R.id.btnAC)
        var btnPlusMinus = findViewById<Button>(R.id.btnplusMinus)
        var btnPercent = findViewById<Button>(R.id.btnPercent)
        var btnPlus = findViewById<Button>(R.id.btnPlus)
        var btnDivide = findViewById<Button>(R.id.btnDivide)
        var btnMultiply = findViewById<Button>(R.id.btnMultiply)
        var btnEq= findViewById<Button>(R.id.btnEq)
        var btnMinus = findViewById<Button>(R.id.btnMinus)
        var btnDot = findViewById<Button>(R.id.btnDot)
        var etShowNumber = findViewById<EditText>(R.id.etShowNumber)

        var btnSelect  = view as Button
        var btnClickValue:String = etShowNumber.text.toString()
        when(btnSelect.id){
            btn0.id->{
                btnClickValue += "0"
            }
            btn1.id->{
                btnClickValue += "1"
            }
            btn2.id->{
                btnClickValue += "2"
            }
            btn3.id->{
                btnClickValue += "3"
            }
            btn4.id->{
                btnClickValue += "4"
            }
            btn5.id->{
                btnClickValue += "5"
            }
            btn6.id->{
                btnClickValue += "6"
            }
            btn7.id->{
                btnClickValue += "7"
            }
            btn8.id->{
                btnClickValue += "8"
            }
            btn9.id->{
                btnClickValue += "9"
            }
            btnDot.id->{
//                TODO: Prevent from adding more than one dot
                btnClickValue = "."
            }
            btnPlus.id->{
                btnClickValue = "+"
            }
            btnMinus.id->{
                btnClickValue = "-"+btnClickValue
            }
            btnMultiply.id->{
                btnClickValue = "*"
            }
            btnPlusMinus.id->{
                btnClickValue = "+/-"
            }

        }
        etShowNumber.setText(btnClickValue)

    }
}