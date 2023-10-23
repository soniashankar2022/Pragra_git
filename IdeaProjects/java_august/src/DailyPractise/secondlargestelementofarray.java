package dailypractise;

import java.util.Scanner;

public class secondlargestelementofarray {

    private static Scanner scan;

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int sizeofarray = scan.nextInt();

        int[] x = new int[sizeofarray];

        System.out.println("enter the elements inside the array");
        for (int i = 0; i < sizeofarray; i++) {
            x[i] = scan.nextInt();

        }
        int lengthofarray = x.length;
        System.out.println("the final size is " + lengthofarray);


        // Find the largest element among the array
        int largest = x[0];
        for (int i = 1; i < sizeofarray; i++) {
            if (x[i] > largest) {
                largest = x[i];
            }
        }

// Find the second largest element
        int secondLargest = x[0];
        for (int i = 0; i < sizeofarray; i++) {
            if (x[i] < largest && x[i] > secondLargest) {
                secondLargest = x[i];
            }
        }

        System.out.println("Largest number: " + largest);
        System.out.println("Second largest number: " + secondLargest);


    }
}

