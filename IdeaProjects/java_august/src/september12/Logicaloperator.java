package september12;

public class Logicaloperator {

    public static void main(String[] args) {
        int x = 10;
        int y = 11;

        int a = 20;
        int b = 15;

        //boolean result =x>y;
        //boolean result =x!=y;
        boolean result = x < y && a < b;
        System.out.println(result);

        boolean results = x < y || a < b;
        System.out.println(results);

        boolean result1 = x <= y      ||      a >b;  //true

        boolean result2 = x != y      &&      a <b;  //false

        boolean result3 = x >= y      ||      a >=b;  //tre

        boolean result4 = x <= y      &&      a ==b;  //false

        boolean result5 = x <= y      ||      a >b;  //false
    }
}
