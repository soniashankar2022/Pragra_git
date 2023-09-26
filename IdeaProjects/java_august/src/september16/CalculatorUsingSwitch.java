package september16;

import java.util.Scanner;

public class CalculatorUsingSwitch {

    public static void main(String[] args) {

        System.out.println("Welcome to my calculator");
        System.out.println("1. Press + for addition");
        System.out.println("2. Press - for subtraction");
        System.out.println("3. Press * for multiplication");
        System.out.println("4. Press / for division");
        System.out.println("5. Press % for modulus");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the operation to perform");
        char operator = scanner.next().charAt(0);
        System.out.println("Enter the first number for calculation");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number for calculation");
        int num2 = scanner.nextInt();

        int result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Addition of two numbers is: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Subtraction of two numbers is: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Multiplication of two numbers is: " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println("Division result is: " + result);
                break;
            case '%':
                result = num1 % num2;
                System.out.println("Modulus result is: " + result);
                break;
            default:
                System.out.println("Error! Invalid operator.");
        }
    }
}


