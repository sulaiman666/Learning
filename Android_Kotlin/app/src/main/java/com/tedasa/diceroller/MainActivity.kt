package com.tedasa.diceroller

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        // val roll2Button : Button = findViewById(R.id.button3)

        rollButton.setOnClickListener { rollDice() }

        // Improving UX
        rollDice()

        // roll2Button.setOnClickListener { roll2Dice() }
        // rollButton.setOnClickListener{
        // val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
        // toast.show()
        // Function without using variable, lambda
        // Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()

        // val resultText: TextView = findViewById(R.id.textView)
        // resultText.text = "6"
        // }
    }

//    private fun roll2Dice() {
//        val dice2 = Dice(2)
//        val dice2Roll = dice2.roll()
//        val result2Text : TextView = findViewById(R.id.textView2)
//        result2Text.text = dice2Roll.toString()
//    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceImage : ImageView = findViewById(R.id.imageView)
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
        diceImage.contentDescription = diceRoll.toString()

        // Second dice
        val diceRoll2 = dice.roll()
        val diceImage2 : ImageView = findViewById(R.id.imageView2)
        val drawableResource2 = when (diceRoll2) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage2.setImageResource(drawableResource2)
        diceImage2.contentDescription = diceRoll2.toString()
        // diceImage.setImageResource(R.drawable.dice_2)
        // val resultText: TextView = findViewById(R.id.textView)
        // resultText.text = if ( diceRoll == 6) "You got ${diceRoll} the lucky number, Congrats!" else "You got ${diceRoll}, Try again!"
        // resultText.text = when (diceRoll) {
        //     6 -> "You got 6, congrats"
        //     else -> "Try again!"
        // }
    }
}

class Dice(private val diceSide: Int) {
    fun roll(): Int {
        return (1..diceSide).random()
    }
}