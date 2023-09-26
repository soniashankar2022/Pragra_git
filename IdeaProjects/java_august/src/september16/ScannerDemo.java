package september16;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        System.out.println("Welcome to my calculator");
        System.out.println("1. press + for addition");
        System.out.println("2. press - for Subtraction");
        System.out.println("3. Press * fro multiplication");
        System.out.println("4 .press / for division");


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the operation to perform");
        char operator = scanner.next().charAt(0);
        System.out.println("Enter the first number for calculation");
        int num1 = scanner.nextInt();
        System.out.println("enter the second number for calculation");
        int num2 = scanner.nextInt();



        int  result;
        if (operator == '+') {
            result = num1 + num2;
            System.out.println("Additon of two nuumber is : " + result);
        } else if (operator == '-') {
            result = num1 - num2;
            System.out.println("Subtraction of two nuumber is : " + result);
        } else if (operator == '*') {
            result = num1 * num2;
            System.out.println("Multiplication of two nuumber is : " + result);
        } else if (operator == '/') {

            result = num1 / num2;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Error! Invalid operator.");
        }
    }
}


