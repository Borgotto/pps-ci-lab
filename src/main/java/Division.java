public class Division {
    private int firstNumber;
    private int secondNumber;

    public Division(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int doDivision() {
        if (secondNumber != 0) {
            return firstNumber / secondNumber;
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }
}