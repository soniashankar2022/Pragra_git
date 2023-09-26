package september16;

import java.util.Scanner;

public class IvrSwitchProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Press 1 for English");
        System.out.println("Press 2 for French");
        System.out.println("Press 3 for Spanish");
        System.out.println("Press the number for language selection ");

        int languageChoice = scanner.nextInt();
        scanner.nextLine();

        if (languageChoice == 1) {
            System.out.println("You selected English.");
            System.out.println("Press 1 for Internet");
            System.out.println("Press 2 for Mobile");
            System.out.println("Press 3 for Cable");

            int serviceChoice = scanner.nextInt();
            scanner.nextLine();

            if (serviceChoice == 1) {
                System.out.println("New connection established for Internet.");
            } else if (serviceChoice == 2) {
                System.out.println("Existing connection for Mobile.");
            } else if (serviceChoice == 3) {
                System.out.println("Bill payment for Cable.");
            } else {
                System.out.println("Invalid service choice.");
            }

        } else if (languageChoice == 2) {
            System.out.println("You selected French.");
            System.out.println("Press 1 for Internet");
            System.out.println("Press 2 for Mobile");
            System.out.println("Press 3 for Cable");

            int serviceChoice = scanner.nextInt();
            scanner.nextLine();

            if (serviceChoice == 1) {
                System.out.println("New connection established for Internet.");
            } else if (serviceChoice == 2) {
                System.out.println("Existing connection for Mobile.");
            } else if (serviceChoice == 3) {
                System.out.println("Bill payment for Cable.");
            } else {
                System.out.println("Invalid service choice.");
            }

        } else if (languageChoice == 3) {
            System.out.println("You selected Spanish.");
            System.out.println("Press 1 for Internet");
            System.out.println("Press 2 for Mobile");
            System.out.println("Press 3 for Cable");

            int serviceChoice = scanner.nextInt();
            scanner.nextLine();

            if (serviceChoice == 1) {
                System.out.println("New connection established for Internet.");
            } else if (serviceChoice == 2) {
                System.out.println("Existing connection for Mobile.");
            } else if (serviceChoice == 3) {
                System.out.println("Bill payment for Cable.");
            } else {
                System.out.println("Invalid service choice.");
            }

        }
    }
}



