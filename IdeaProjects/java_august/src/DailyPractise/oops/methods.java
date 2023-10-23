package DailyPractise.oops;

class methods {
    public int addnumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String args[]) {
        int num1 = 20;
        int num2 = 90;

        methods object = new methods();
        int result = object.addnumbers(num1, num2);
        System.out.println(result);
    }
}