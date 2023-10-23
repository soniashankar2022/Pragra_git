package Assignments1;


import java.util.Scanner;

//Write a Java program to display n terms of natural numbers and their sum.
public class NNaturalNumbers {
    public static void main(String[] args) {
        Scanner Scan=new Scanner(System.in);
        System.out.println("enter the number");
        int n= Scan.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            System.out.println( i);
            sum=sum+i;

        }
        System.out.println("the total sum is"+ sum);


    }
}
