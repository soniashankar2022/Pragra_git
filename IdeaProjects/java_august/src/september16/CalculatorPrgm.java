package september16;

public class CalculatorPrgm {
    public static void main(String[] args) {
        double num1 = 10.0;
        double num2 = 5.0;
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
        }
        else {
            System.out.println("Error! Invalid operator.");
        }
    }
}

