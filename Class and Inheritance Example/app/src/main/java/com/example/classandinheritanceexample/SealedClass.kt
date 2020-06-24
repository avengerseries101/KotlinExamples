package com.example.classandinheritanceexample

import android.util.Log

sealed class Color {
    class Red : Color()
    class Orange : Color()
    class Blue : Color()
    class Black : Color()
}

fun chosenColor(c: Color) =
    when (c) {
        is Color.Red -> Log.d("sealed", "You Choose Red Color")
        is Color.Orange -> Log.d("sealed", "You Choose Orange Color")
        is Color.Blue -> Log.d("sealed", "You Choose Blue Color")
        is Color.Black -> Log.d("sealed", "You Choose Black Color")
    }
