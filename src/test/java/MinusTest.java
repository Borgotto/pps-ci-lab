import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class MinusTest {

    @Test
    void testMinus() {
        assertEquals(5, Minus.subtract(10, 5));
        assertEquals(0, Minus.subtract(5, 5));
        assertEquals(-5, Minus.subtract(5, 10));
    }
}
