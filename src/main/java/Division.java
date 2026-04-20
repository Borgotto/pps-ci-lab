public class Division {
    private float firstNumber;
    private float secondNumber;

    public Division(float firstNumber, float secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public float doDivision() {
        if (secondNumber != 0) {
            return firstNumber / secondNumber;
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }
}