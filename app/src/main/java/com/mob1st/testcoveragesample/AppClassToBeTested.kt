package com.mob1st.testcoveragesample

data class AppClassToBeTested(val someBoolean: Boolean) {

    fun yesNo(): String {
        return if (someBoolean) {
            "yes"
        } else {
            "no"
        }
    }

}