package september16;

public class CalculatorPrgm {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        char operator = '*';

        double result;

        if (operator == '+') {
            result = num1 + num2;
            System.out.println("Result: " + result);
        } else if (operator == '-') {
            result = num1 - num2;
            System.out.println("Result: " + result);
        } else if (operator == '*') {
            result = num1 * num2;
            System.out.println("Result: " + result);
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Error! Division by zero.");
            }
        } else {
            System.out.println("Error! Invalid operator.");
        }
    }
}


