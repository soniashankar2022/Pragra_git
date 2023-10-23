package Assignments1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//Write a Java program to display the multiplication table of a given integer.
public class MultiplicationOfGivenNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the multiplication number");
        int a=scanner.nextInt();


        for(int i=1;i<=12;i++){
            int result =a*i;

            System.out.println(a + " * " + i + " = " + result);
        }



    }

}
