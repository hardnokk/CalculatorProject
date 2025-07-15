package calculator.java;
import java.util.Scanner;

public class CalculatorOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculator Start");
        System.out.println("Type 'exit' to end calculation.");

        while (true) {
            System.out.println("Enter first number(or 'exit'): ");
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

            System.out.println("Enter operation : ");
            char oper = scanner.next().charAt(0);

            System.out.println("Enter second number: ");
            int num2;
            try {
                num2 = Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please try again.");
                continue;
            }

            int result;
            switch (oper) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Cannot be divided by 0");
                    } else {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    }
                    break;
                default:
                    System.out.println("Please enter a valid operation");
                    System.out.println("What you entered : " +"'"+ num1 +"'"+"'"+ oper +"'"+"'"+ num2 +"'");
            }
        }
        scanner.close();
    }
}
