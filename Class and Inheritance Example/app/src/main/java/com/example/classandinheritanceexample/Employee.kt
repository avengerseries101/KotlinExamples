package com.example.classandinheritanceexample

import android.util.Log

//Inheritance sample class
open class Employee(eName: String) {
    init {
        Log.d("@@@@@", "Employee : init : He/She is an employee")
    }

    open var name = eName
    var age: Int = 23

    open fun printDetails() {
        Log.d("@@@@@", "PrintDetails : Employee")
        Log.d("@@@@@", "Employee Name is $name.")
    }
}

open class Developer(dName: String, income: Int) : Employee(dName) {
    init {
        Log.d("@@@@@", "Developer : init : He/She is an Developer")
    }

    override var name = dName
    open var salary = income

    override fun printDetails() {
        Log.d("@@@@@", "PrintDetails : Developer")
        Log.d("@@@@@", "Developer name is $name and salary is $salary")
    }
}
