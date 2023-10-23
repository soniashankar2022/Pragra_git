package Assignments1;

import java.util.Scanner;

//.Write a program in Java to input 5 numbers from the keyboard and find their sum and average.
public class SumAndAverage {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the input");
        int a= scan.nextInt();
        int sum=0;
        for(int i=0;i<a;i++) {
            int b = scan.nextInt();

                sum=sum+b;


            }
            double avg=(double) sum/a;
        System.out.println("the sum is"+ sum);
            System.out.println("the avg is"+ avg);
        }


    }

