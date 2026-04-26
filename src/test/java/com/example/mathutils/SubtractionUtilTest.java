package com.example.mathutils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * A Java test class for {@link SubtractionUtil}.
 */
public class SubtractionUtilTest {

    /**
     * Tests the subtraction between two numbers.
     */
    @Test
    public void testSubtraction() {
        final var a = 5;
        final var b = 3;
        final var result = SubtractionUtil.subtract(a, b);
        final var expectedResult = 2;
        assertEquals(expectedResult, result);
    }

}
