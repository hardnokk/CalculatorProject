package calculator.java;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorTwo calculator = new CalculatorTwo();

        System.out.println("Calculator Start");
        System.out.println("Type 'exit' to end calculation.");

        while (true) {
            System.out.print("Enter first number (or 'exit'): ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Quit the calculator.");
                break;
            }

            int num1;
            try {
                num1 = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please try again.");
                continue;
            }

            System.out.print("Enter operation (+, -, *, /): ");
            char oper = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            int num2;
            try {
                num2 = Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please try again.");
                continue;
            }

            try {
                int result = calculator.calculate(num1, num2, oper);
                System.out.println("Result: " + result);
            } catch (ArithmeticException | IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }
}