package com.mob1st.testcoveragesample

import org.junit.Test

class AppClassToBeTestedTest {

    @Test
    fun `test True`(){
        val subject = AppClassToBeTested(true)
        assert(subject.yesNo() == "yes")
    }

    @Test
    fun `test the list method returning 1`() {
        val subject = AppClassToBeTested(true)
        assert(subject.aThirdMethod().first() == 1)
    }

    @Test
    fun `test the list method returning 2`() {
        val subject = AppClassToBeTested(false)
        assert(subject.aThirdMethod().first() == 2)
    }

}