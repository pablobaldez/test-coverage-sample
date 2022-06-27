package com.mob1st.mylibrary

import java.lang.IllegalStateException
import org.junit.Test
import kotlin.test.assertFailsWith

class CalculatorTest {

    @Test
    fun `test case 1`() {
        val subject = Calculator(3, 2)
        assert(subject.div() != 0)
    }

    @Test
    fun `test case 2`() {
        val subject = Calculator(0, 2)
        assertFailsWith<IllegalStateException> {
            subject.div()
        }
    }
}