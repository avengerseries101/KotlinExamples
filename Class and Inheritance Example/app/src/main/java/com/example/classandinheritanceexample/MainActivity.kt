package com.example.classandinheritanceexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inheritanceClass()
        dataClass()
        nestedInner()
        sealedClass()
        enumClass()
    }

    private fun enumClass() {
        val artist = Artist.Singer
        Log.d("enum", "Enum value : " + artist.shorthand)
        artist.shorthand = "Shorthand Sing."
        Log.d("enum", "Enum value changed to : " + Artist.Singer.shorthand)
    }

    private fun sealedClass() {
        val choice = Color.Black()
        chosenColor(choice)
    }

    private fun nestedInner() {
        val outer = OuterClass()
        Log.d("nestedInner", outer.InnerNestedClass().demoFunction())

        val inner = OuterClass().InnerNestedClass()
        Log.d("nestedInner", inner.demoFunction())
    }

    private fun dataClass() {
        //DataClass sample code
        val student1 = Student("Saumya", 23)
        val student2 = Student("Shivani", 23)
        val student3 = Student("Saumya", 24)

        Log.d("data", "Student Name is: ${student1.name} and age is: ${student1.age}")
        Log.d("data", "Student Name is: ${student2.name} and age is: ${student2.age}")
        Log.d("data", "Student Name is: ${student3.name} and age is: ${student3.age}")

        if (student1.name == student2.name)
            Log.d("data", "student1 has same name as student2.")
        else
            Log.d("data", "student1 and student2 does not have same name.")

        if (student1.age == student2.age)
            Log.d("data", "Student1 and student2 are of same age.")
        else
            Log.d("data", "Student1 and student2 have different age.")

        Log.d("data", "Hashcode of student1 : ${student1.hashCode()}")
        Log.d("data", "Hashcode of student2 : ${student2.hashCode()}")
        Log.d("data", "Hashcode of student3 : ${student3.hashCode()}")
    }

    private fun inheritanceClass() {
        //Inheritance sample code
        var employee = Employee("Shivani")
        employee.printDetails()
        Log.d("@@@@@", "==========================================")
        var developer = Developer("Elizabeth", 10000)
        developer.printDetails()
        Log.d("@@@@@", developer.name + "'s age is " + developer.age.toString())
    }
}

