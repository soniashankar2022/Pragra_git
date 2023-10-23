package DailyPractise.oops;

public class DefaultConstructor {
    int i;
    String s;

    public static void main(String args[]) {
        DefaultConstructor obj = new DefaultConstructor();
        int result = obj.i;
        String s1 = obj.s;
        System.out.println(result);
        System.out.println(s1);
    }
}
