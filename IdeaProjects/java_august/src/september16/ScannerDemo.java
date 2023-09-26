package september16;

public class ScannerDemo {

    public static void main(String[] args) {
        double num1 = 10.0;
        double num2 = 5.0;
        char operator = '/';

        double result;
        System.out.println("Welcome to my calculator");
        System.out.println("1. press + for addition");
        System.out.println("2. press - for Subtraction");
        System.out.println("3. Press * fro multiplication");
        System.out.println("4 .press / for division");

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


