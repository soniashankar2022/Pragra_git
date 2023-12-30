package dailypractise.DatatypesandOperators;

import java.util.Scanner;

public class IntegertoBinary {
    public static void main(String[] args) {
        String binary = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the decimal number");
        int n = scan.nextInt();

        if (n == 0) {
            binary = "0";  // Special case for decimal number 0
        } else {
            while (n > 0) {
                int remainder = n % 2;
                binary = remainder + binary;
                n = n / 2;
            }
        }

        System.out.println("Binary representation: " + binary);
    }
}
