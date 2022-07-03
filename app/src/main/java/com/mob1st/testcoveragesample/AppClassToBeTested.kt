package com.mob1st.testcoveragesample

data class AppClassToBeTested(val someBoolean: Boolean) {

    fun yesNo(): String {
        return if (someBoolean) {
            "yes"
        } else {
            "no"
        }
    }

    fun aSecondMethod() {
        if (someBoolean) {
            print("some error")
        } else {
            print("another error")
        }
    }

}