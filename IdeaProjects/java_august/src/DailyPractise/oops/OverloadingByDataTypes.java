package DailyPractise.oops;

class OverloadingByDataTypes {
    private static void display(int a) {
        System.out.println("Integer datatype");
    }

    private static void display(String a) {
        System.out.println("String datatype");
    }

    public static void main(String args[]) {
        display(1);
        display("hello welcome to methodoverloading concept");
    }
}
