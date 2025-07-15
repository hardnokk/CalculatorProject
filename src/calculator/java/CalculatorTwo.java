package calculator.java;

public class CalculatorTwo {
    public int calculate(int num1, int num2, char oper) {
        return switch (oper) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    throw new ArithmeticException("Cannot divide by 0");
                }
                yield num1 / num2;
            }
            default -> throw new IllegalArgumentException("Invalid operator: " + oper);
        };
    }
}
