package AssignmentPragra.Assignments1;

//Write a Java program that displays the sum of n odd natural numbers.

import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number of input");
        int a=scan.nextInt();
int sum=0;
        for(int i=0;i<a;i++){
            int b=scan.nextInt();
            if(b%2!=0){
             sum=sum+b;
                System.out.println("entered no is odd number" + sum);
        }else{
                System.out.println("not a odd number");
            }



        }
        System.out.println("The total odd number is "+ sum);


    }
}
