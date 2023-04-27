package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import android.widget.Toast.makeText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        lateinit var diceImage : ImageView

    }

    private fun rollDice() {
        val randomInt = (1..6).random()
        val diceImage : ImageView = findViewById(R.id.dice_image)



        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)

        val txtResultado: TextView = findViewById(R.id.txtResultado)
        val edtNumber: EditText = findViewById(R.id.edtNumber)
        val comprardor: Int = edtNumber.text.toString().toInt()

        if(randomInt == comprardor){
            txtResultado.setText("Você Venceu!")
        }else{
            txtResultado.setText("You Perdeu!")
        }
    }
}