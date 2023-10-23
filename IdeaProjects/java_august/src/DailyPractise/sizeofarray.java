package DailyPractise;

import java.util.Scanner;

public class sizeofarray {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of array");
        int sizeofarray = scan.nextInt();
        int[] array = new int[sizeofarray];

        System.out.println("enter the elements inside array");
        for (int i = 0; i < sizeofarray; i++) {
            array[i] = scan.nextInt();
        }
        int numberOfElements = array.length;
    }
}

