package com.example.dicerollerkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "Dice Roll"
        val textDiceValue: TextView = findViewById(R.id.tv_diceValue);
        textDiceValue.text = "Roll The Dice!!"

        val btnRoll: Button = findViewById(R.id.btn_roll)
        btnRoll.setOnClickListener {
            val randomNo = (1..6).random()
            textDiceValue.text = randomNo.toString()
        }

        val btnCountUp: Button = findViewById(R.id.btn_countUp)
        btnCountUp.setOnClickListener {
            val value: String = textDiceValue.text.toString()
            if (value == "Roll The Dice!!") {
                textDiceValue.text = "1"
            } else if (value == "6") {
                Toast.makeText(this, "Limit Exceeded", Toast.LENGTH_LONG).show()
            } else {
                var count: Int = value.toInt()
                count += 1
                textDiceValue.text = count.toString()
            }
        }

        val btnReset: Button = findViewById(R.id.btn_reset)
        btnReset.setOnClickListener {
            textDiceValue.text = "0"
        }
    }
}
