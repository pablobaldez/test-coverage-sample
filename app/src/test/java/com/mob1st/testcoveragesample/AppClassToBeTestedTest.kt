package com.mob1st.testcoveragesample

import org.junit.Test

class AppClassToBeTestedTest {

    @Test
    fun `test True`(){
        val subject = AppClassToBeTested(true)
        assert(subject.yesNo() == "yes")
    }

}