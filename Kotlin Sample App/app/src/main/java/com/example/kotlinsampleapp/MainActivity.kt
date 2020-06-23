package com.example.kotlinsampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editFirstName: EditText = findViewById(R.id.et_firstName)
        var editLastName: EditText = findViewById(R.id.et_lastName)
        var buttonLogin: Button = findViewById(R.id.btn_login)
        var textResult: TextView = findViewById(R.id.tv_result)

        buttonLogin.setOnClickListener {
            var member = Member()
            member.fname = editFirstName.text.toString()
            member.lname = editLastName.text.toString()
            textResult.text = "Welcome ${member.fname} ${member.lname} You're now the member of this class."
        }
    }
}

class Member {
    var fname: String = "fname"
    var lname: String = "lname"
}