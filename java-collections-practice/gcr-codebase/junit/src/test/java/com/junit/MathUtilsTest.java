package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

    MathUtils mathUtils = new MathUtils();

    // ✅ Verify exception is thrown
    @Test
    void testDivideByZeroException() {

        ArithmeticException exception = assertThrows(
                ArithmeticException.class,
                () -> mathUtils.divide(10, 0)
        );

        assertEquals("Division by zero is not allowed", exception.getMessage());
    }

    // ✅ Normal case
    @Test
    void testDivideSuccess() {
        assertEquals(5, mathUtils.divide(10, 2));
    }
}

