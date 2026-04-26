import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class ScalaMinusTest:

  @Test
  def testScalaMinus(): Unit =
    assertEquals(3, ScalaMinus(5, 2))
    assertEquals(0, ScalaMinus(2, 2))
    assertEquals(-1, ScalaMinus(2, 3))
