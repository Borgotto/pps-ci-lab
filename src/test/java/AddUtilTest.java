import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddUtilTest {
    
    @Test
    public void testAdd() {
        final var a = 2;
        final var b = 3;
        final var result = AddUtil.add(a, b);
        final var expectedResult = 5;
        assertEquals(expectedResult, result);
    }
    
}
