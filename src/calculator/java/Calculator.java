package calculator.java;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;

        // 두 수의 사칙연산만이 가능한 코드
        System.out.println("Enter first number: ");
        a = scanner.nextInt(); // 숫자(정수)를 받아옴

        System.out.println("Enter operation : ");
        char c = scanner.next().charAt(0);

        System.out.println("Enter second number: ");
        b = scanner.nextInt();

        System.out.print("Result: : ");

        if(c == '+'){
            System.out.print(a + b);
        }else if(c == '-'){
            System.out.print(a - b);
        }else if(c == '*'){
            System.out.print(a * b);
        }else if(c == '/'){
            if(a == 0 || b == 0){ // 0을 나눗셈에 사용할 수 없음
                System.out.println("Cannot be divided by 0");
            }else{
                System.out.print(a / b);
            }
        }else{
            System.out.println("Please enter a valid operation");
            System.out.println("What you entered : " +"'"+ a +"'"+"'"+ c +"'"+"'"+ b +"'");
        }
    }
}
