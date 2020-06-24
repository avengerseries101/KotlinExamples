package com.example.collectionexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editText: EditText = findViewById(R.id.et_fruit)
        var button: Button = findViewById(R.id.btn_add)
        var textView: TextView = findViewById(R.id.tv_list)

        var list: MutableList<String> = mutableListOf()

        var index: Int = 0
        button.setOnClickListener {
            list.add(index, editText.text.toString())
            Log.d("@@@@@", "List is  : $list")
            textView.append("New Fruit Added is : ${list[index]} \n")
            index++
        }
    }
}

