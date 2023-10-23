
package Assignments1;

//Write a Java program to display the cube of the given number up to an integer.

import java.util.Scanner;

public class CubeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int a = scan.nextInt();
        for (int i = 1; i <= a; i++) {
            int b = i * i * i;
            System.out.println("the cube of given number is " + b);
        }
    }
}
