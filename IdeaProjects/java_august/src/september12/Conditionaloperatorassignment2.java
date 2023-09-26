package september12;

public class Conditionaloperatorassignment2 {

    public static void main(String[] args) {
        int year = 2024;

//If the year is divisible by 4 and not divisible by 100, or it is divisible by 400, then it's a leap year.
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
