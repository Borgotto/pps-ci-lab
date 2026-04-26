package com.example.mathutils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * A Java test class for {@link AdditionUtil}.
 */
public class AdditionUtilTest {

    /**
     * Tests the addition between two numbers.
     */
    @Test
    public void testAddition() {
        final var a = 2;
        final var b = 3;
        final var result = AdditionUtil.add(a, b);
        final var expectedResult = 5;
        assertEquals(expectedResult, result);
    }

}
