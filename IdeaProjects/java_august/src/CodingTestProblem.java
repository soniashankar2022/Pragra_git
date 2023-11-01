import java.util.Arrays;


public class CodingTestProblem {
    public String[] fizzBuzz(int n) {
        //create an array of strings to store the result
        String[] result = new String[n];
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result[i - 1] = "Fizz".concat("Buzz");

            } else if (i % 3 == 0) {
                result[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                result[i - 1] = "Buzz";
            } else {
                result[i - 1] = i + "";
            }

        }
        return result;
    }
    public static void main(String[] args) {
        CodingTestProblem solution = new CodingTestProblem();

        String[] output1 = solution.fizzBuzz(3);
        System.out.println("Output for n = 3: " + Arrays.toString(output1));

        String[] output2 = solution.fizzBuzz(5);
        System.out.println("Output for n = 5: " + Arrays.toString(output2));

        String[] output3 = solution.fizzBuzz(15);
        System.out.println("Output for n = 15: " + Arrays.toString(output3));
    }
    private static void printArray(String[] arr) {
        for (String str : arr) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

}
