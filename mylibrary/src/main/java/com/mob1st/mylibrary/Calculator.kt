package com.mob1st.mylibrary

import java.lang.IllegalStateException

data class Calculator(
    val value1: Int,
    val value2: Int
) {

    fun div(): Int {
        return if (value1 > 0) {
            value1 / value2
        } else throw IllegalStateException("invalid check exception")
    }

}