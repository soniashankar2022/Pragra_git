package september23;

import java.util.Scanner;

public class CalculatorDemo {

    public static void main(String[] args) {

        char choice;

        do {
            System.out.println("Welcome to Xyz Comms");
            System.out.println("1. Press 1 for English");
            System.out.println("2. Press 2 for French");
            System.out.println("3. Press 3 for Spanish");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your option : ");
            int input = scanner.nextInt();

            //logic -- check whether is valid or not

            switch (input) {

                case 1:
                    sumPragra(10, 20);
                    break;
                case 2:
                    sumPragra(10, 20);
                    break;
                case 3:
                    sumPragra(10, 20);
                    break;
                default:
                    System.out.println("wrong input ");
            }
            System.out.println(" Do you want to continue ? Press Y or N");
            choice = scanner.next().charAt(0);
        } while (choice != 'N');
    }


    public static int sumPragra(int num1, int num2) { // 10 and 20
        int sum = num1 + num2; // 30
        return sum; // 30
    }
}


