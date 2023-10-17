package DailyPractise;

import java.util.Scanner;

public class largestelementofarray {

    private static Scanner scan;

    public static void main(String[] args) throws Exception {

Scanner scan= new Scanner(System.in);
        System.out.println("enter the size of the array");
        int sizeofarray=scan.nextInt();

        int [] arr=new int[sizeofarray];

        System.out.println("enter the elements inside the array");
        for(int i=0;i<sizeofarray;i++){
            arr[i]=scan.nextInt();



        }
        int arraysize=arr.length;
        System.out.println("the final size is " + arraysize);

        //to find the largest element among the array
        int largest= arr[0];
        for(int i=0;i<sizeofarray;i++){
            if(arr[i]>largest){
                largest=arr[i];

            }
        }

        System.out.println("this is the largest number "+ largest);



    }


}

