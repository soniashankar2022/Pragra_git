package september16;

import java.util.Scanner;

public class IvrSwitchProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


            System.out.println("Welcome to the IVR system!");
            System.out.println("Please select an option:");
            System.out.println("1. Press 1 for account information");
            System.out.println("2. Press 2 for billing information");
            System.out.println("3. Press 3 to speak to a representative");
            System.out.println("4. Press 4 to exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("You selected account information.");

                    break;
                case 2:
                    System.out.println("You selected billing information.");

                    break;
                case 3:
                    System.out.println("Please wait while we connect you to a representative.");

                    break;
                case 4:
                    System.out.println("Thank you for using our IVR system. Goodbye!");

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }



