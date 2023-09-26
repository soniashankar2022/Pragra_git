package september16;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        System.out.println("Welcome to my calculator");
        System.out.println("1. press + for addition");
        System.out.println("2. press - for Subtraction");
        System.out.println("3. Press * fro multiplication");
        System.out.println("4 .press / for division");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                System.out.println("print 1 statement");
                break;
            case 2:
                System.out.println("print 2 statement");
                break;
            case 3:
                System.out.println("print 3 statement");
                break;

            case 4:
                System.out.println("print 4 statement");
                break;
            case 5:
                System.out.println("print 5 statement");
                break;
            default:
                System.out.println("wrong input");
        }

    }

}


