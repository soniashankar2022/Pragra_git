package dailypractise.oops;

class methodwithloop {

    public static int square(int a) {
        return a * a;
    }

    public static void main(String args[]) {
        for (int i = 1; i < 5; i++) {
            int result = square(i);
            System.out.println("the result of" + i + "is" + result);
        }
    }
}