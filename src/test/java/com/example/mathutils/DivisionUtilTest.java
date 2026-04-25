package com.example.mathutils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * A Java test class for {@link DivisionUtil}.
 */
public class DivisionUtilTest {

    /**
     * Tests the division between two numbers.
     */
    @Test
    public void testSubtraction() {
        final var a = 6;
        final var b = 3;
        final var result = DivisionUtil.divide(a, b);
        final var expectedResult = 2;
        assertEquals(expectedResult, result);
    }

    /**
     * Tests that the division fails if the divider is zero.
     */
    @Test
    public void testDivisionFailsIfDividerIsZero() {
        final var a = 3;
        final var b = 0;
        assertThrows(
            ArithmeticException.class,
            () -> DivisionUtil.divide(a, b)
        );
    }

}
