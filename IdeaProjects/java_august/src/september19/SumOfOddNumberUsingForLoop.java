package september19;

public class SumOfOddNumberUsingForLoop {
    public static void main(String args[]) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {

            if (i % 2 != 0)


            System.out.println(i);
            sum += i;
        }
        System.out.println("Sum of even numbers from 1 to 100: " + sum);
    }

}



