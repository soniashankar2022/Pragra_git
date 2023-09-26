package september19;

import java.util.Scanner;

public class WhileUsingSumOfNaturalNum {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int limit=scan.nextInt();

        int sum = 0;
        int number = 1;

        while (number <= limit) {
            sum += number;
            number++;
        }

        System.out.println("Sum of natural numbers  is: " + sum);
    }
}

