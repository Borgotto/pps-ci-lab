import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ScalaAddUtilTest:
  
  @Test def testAddition(): Unit =
    val a = 2
    val b = 3
    val result = ScalaAddUtil.add(a, b)
    val expectedResult = 5
    assertEquals(expectedResult, result)
