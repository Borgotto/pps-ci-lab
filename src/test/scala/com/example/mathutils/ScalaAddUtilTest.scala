package com.example.mathutils

import com.example.mathutils.ScalaAdditionUtil
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/**
 * A Scala test class for {@link ScalaAdditionUtil}.
 */
class ScalaAddUtilTest:

  /**
   * Tests the addition between two numbers.
   */
  @Test def testAddition(): Unit =
    val a = 2
    val b = 3
    val result = ScalaAdditionUtil.add(a, b)
    val expectedResult = 5
    assertEquals(expectedResult, result)
