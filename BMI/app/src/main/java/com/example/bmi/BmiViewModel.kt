package com.example.bmi

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class BmiViewModel: ViewModel() {
    var heightInput by mutableStateOf("")
    var weightInput by mutableStateOf("")

    private val height: Int
        get () {
            return heightInput.toIntOrNull() ?: 0
        }
    private val weight: Int
        get () {
            return weightInput.toIntOrNull() ?: 0
        }
    val bmi: Float
        get() {
            return if (height > 0) {
                weight.toFloat() / ((height.toFloat() / 100) * (height.toFloat() / 100))
            } else {
                0f
            }
        }
}