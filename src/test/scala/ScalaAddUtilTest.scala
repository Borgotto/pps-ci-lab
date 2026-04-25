import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/**
 * A Scala test class for {@link ScalaAddUtil}.
 */
class ScalaAddUtilTest:

  /**
   * Tests the addition between two numbers.
   */
  @Test def testAddition(): Unit =
    val a = 2
    val b = 3
    val result = ScalaAddUtil.add(a, b)
    val expectedResult = 5
    assertEquals(expectedResult, result)
