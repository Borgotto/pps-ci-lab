/**
 * Simple class to do a division between two numbers
 */
public class Division {
    private float firstNumber;
    private float secondNumber;

    /**
     *
     * @param firstNumber the dividend of the division
     * @param secondNumber the divisor of the division
     */
    public Division(float firstNumber, float secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    /**
     *
     * @return the quotient of the division
     */
    public float doDivision() {
        if (secondNumber != 0) {
            return firstNumber / secondNumber;
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }
}