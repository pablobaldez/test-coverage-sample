package com.mob1st.testcoveragesample

data class AppClassToBeTested(val someBoolean: Boolean, val theSecondBoolean: Boolean = false) {

    fun yesNo(): String {
        return if (someBoolean) {
            "yes"
        } else {
            "no"
        }
    }

    fun aSecondMethod() {
        if (someBoolean && theSecondBoolean) {
            print("some error")
        } else {
            print("another error")
        }
    }

}