package DailyPractise;

import java.util.Scanner;

public class smallestelementofarray {

    private static Scanner scan;

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = scanner.nextInt();

        int[] arr = new int[size];


        System.out.println("enter the elements of array");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();


        }
        int finalsize = arr.length;
        System.out.println("finalsize is " + finalsize);

        int smallest = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("smallest is" + smallest);


    }


}

