package september30;

public class Reversestring {
    public static void main(String[]args){

                String original = "Pragra";
                String reversed = reverseString(original);
                System.out.println("Reversed String: " + reversed);
            }

            public static String reverseString(String input) {
                char[] charArray = input.toCharArray();
                int left = 0;
                int right = charArray.length - 1;

                while (left < right) {

                    char temp = charArray[left];
                    charArray[left] = charArray[right];
                    charArray[right] = temp;


                    left++;
                    right--;
                }


                return new String(charArray);
            }
        }
