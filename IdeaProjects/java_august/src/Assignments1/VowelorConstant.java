package Assignments1;

import org.w3c.dom.ls.LSOutput;
//Write a Java program that requires the user to enter a single character from the alphabet. Print Vowel or Consonant, depending on user input.
// If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
//example :
//
//Input an alphabet: p
//
//Expected Output:Input letter is Consonant


import java.util.Scanner;

public class VowelorConstant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the alphabet");
        char s = scan.next().charAt(0);

        if (Character.isLetter(s)) {
            if (s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u') {
                System.out.println(s + " is a vowel.");
            } else {
                System.out.println(s + " is a constant .");
            }
        }else {
                System.out.println("the entered value is not a alphabet");
            }

        }
    }
