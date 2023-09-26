package september23;

import java.util.Scanner;

public class PAtternProblem {

    public static void main(String[] args) {

        for (int i = 0; i <5; i++) {
            for (int j = 1; j <5-i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}


