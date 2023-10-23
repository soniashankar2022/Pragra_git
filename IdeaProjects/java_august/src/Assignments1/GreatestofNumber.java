package Assignments1;

import javax.swing.*;
import java.util.Scanner;

//Write a Java program that takes three numbers from the user and prints the greatest number.
public class GreatestofNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three Numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int greatest=a;


        if(b>greatest){
            greatest=b;
            System.out.println("b is greatest");
        }

if(c>greatest){
    greatest=c;
    System.out.println("C is greatest");
}

        System.out.println("The greatest number is: " + greatest);
    }
    }

