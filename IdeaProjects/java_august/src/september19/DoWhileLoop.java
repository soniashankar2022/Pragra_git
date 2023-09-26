package september19;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String args[]) {
int number =2;
int i=1;
int limit =10;
        System.out.println("multiplicaition of 2 table");

        do{
            int result=number *i;
            System.out.println( number +"*" +i + "=" +result);
            i++;
        }while (i<=limit);
        ;
    }

}

