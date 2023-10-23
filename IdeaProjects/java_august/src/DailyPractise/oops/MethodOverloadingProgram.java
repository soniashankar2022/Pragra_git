package dailypractise.oops;

class MethodOverloadingProgram {

    public static double area(float x) {
        System.out.println("the area of the square is " + Math.pow(x, 2) + " sq units");
        return Math.pow(x, 2);

    }

    public static double area(float x, float y) {

        System.out.println("the area of the rectangle is " + x * y + " sq units");
        return x * y;
    }

    public static double area(double x) {
        //System.out.println("the area of the circle is "+x+" sq units");
        return 3.14 * x * x;
    }

    public static void main(String args[]) {
        area(10);
        area(12, 10);
        area(9.0);

    }
}
