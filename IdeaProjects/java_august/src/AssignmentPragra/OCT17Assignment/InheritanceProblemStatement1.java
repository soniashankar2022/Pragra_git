package AssignmentPragra.OCT17Assignment;

class Adder extends Arithmetic {

    public Adder() {
        System.out.println("My superclass is: " + this.getClass().getSuperclass().getName());
    }

    int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
}

class Arithmetic {
    int add(int a, int b) {
        return a + b;
    }
}

public class InheritanceProblemStatement1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Adder a = new Adder();
        System.out.print(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10));
    }
}
