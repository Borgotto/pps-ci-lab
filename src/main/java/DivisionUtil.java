/**
 * A Java utility class for performing divisions.
 */
public final class DivisionUtil {

    private DivisionUtil() { }

    /**
     * Performs the division between the provided numbers.
     *
     * @param a the number being divided
     * @param b the divider
     * @return the result of the division between the two numbers.
     * @throws ArithmeticException if the divider is 0.
     */
    public static float divide(final float a, final float b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }

}
