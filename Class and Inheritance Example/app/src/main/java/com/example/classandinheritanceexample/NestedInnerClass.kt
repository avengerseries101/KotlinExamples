package com.example.classandinheritanceexample

class OuterClass {
    val outerStr = "Outer Class"

    //Inner class can access the outer class members but nested class cannot access
    inner class InnerNestedClass {
        val innerStr = "Nested Class"
        fun demoFunction() = "demoFunction() function using $outerStr"
    }
}

