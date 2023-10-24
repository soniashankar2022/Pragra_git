package AssignmentPragra.Assignment3;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        int choice;
        char continueChoice;
        do {

            System.out.println("Choose an operation:");
            System.out.println("1. Add two numbers");
            System.out.println("2. Add three numbers");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    int num2 = scanner.nextInt();
                    int sum1 = calculator.add(num1, num2);
                    System.out.println("Sum: " + sum1);
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    int num3 = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    int num4 = scanner.nextInt();
                    System.out.print("Enter third number: ");
                    int num5 = scanner.nextInt();
                    int sum2 = calculator.add(num3, num4, num5);
                    System.out.println("Sum: " + sum2);
                    break;

                case 3:
                    System.out.print("Do you want to continue? ");
                    continueChoice = scanner.next().charAt(0);
                    // Consume the newline character after reading the char
                    scanner.nextLine();

                    if (continueChoice == 'y' || continueChoice == 'Y') {
                        continue;
                    } else if (continueChoice == 'n' || continueChoice == 'N') {
                        System.out.println("Bye!");
                        choice = 3;
                    } else {
                        System.out.println("Invalid choice. Please try again.");
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 3);

        scanner.close();
    }
}
