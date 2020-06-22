package com.example.imagediceroller

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var imageDice: ImageView
    lateinit var imageDice2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageDice = findViewById(R.id.iv_diceImage)
        imageDice2 = findViewById(R.id.iv_diceImage2)
        val btnRoll: Button = findViewById(R.id.btn_roll)
        val btnReset: Button = findViewById(R.id.btn_reset)

        btnRoll.setOnClickListener {
            imageDice.setImageResource(getRandomInt())
            imageDice2.setImageResource(getRandomInt())
        }

        btnReset.setOnClickListener {
            imageDice.setImageResource(resetTheDiceImage())
            imageDice2.setImageResource(resetTheDiceImage())
        }
    }

    private fun getRandomInt(): Int {
        val randomNo = (1..6).random()
        val drawableResource = when (randomNo) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        return drawableResource
    }

    private fun resetTheDiceImage(): Int {
        val resetDrawable = R.drawable.empty_dice
        return resetDrawable
    }
}

