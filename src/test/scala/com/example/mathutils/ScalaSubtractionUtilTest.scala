package com.example.mathutils

import com.example.mathutils.ScalaSubtractionUtil
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/**
 * A Scala test class for {@link ScalaSubtractionUtil}.
 */
class ScalaSubtractionUtilTest:

  /**
   * Tests the subtraction between two numbers.
   */
  @Test
  def testScalaSubtractionUtil(): Unit =
    val a = 5
    val b = 3
    val result = ScalaSubtractionUtil.subtract(a, b)
    val expectedResult = 2
    assertEquals(expectedResult, result)
