package dailypractise;

import java.util.Scanner;

public class secondsmallestelementofarray {

    private static Scanner scan;

    public static void main(String[] args) throws Exception {
Scanner scanner=new Scanner(System.in);
        System.out.println("enter the size of array");
       int arraysize= scanner.nextInt();

       int[] arr=new int[arraysize];


        System.out.println("enter the elements of array");
        for(int i=0;i<arraysize;i++){
            arr[i]=scanner.nextInt();


        }
        int finallenght=arr.length;
        System.out.println("final length" + finallenght);


       int smallest= arr[0];
       for(int i=0;i< arraysize;i++){
           if(arr[i]< smallest){
               smallest=arr[i];

           }
           }
        int secondsmallest=arr[0];
        for(int i=1;i<arraysize;i++){
            if(arr[i]>smallest && arr[i]<secondsmallest){
                secondsmallest=arr[i];
            }
       }
        System.out.println("smallest is "+ smallest);
        System.out.println("seconssmallest element is" + secondsmallest);
    }
}

