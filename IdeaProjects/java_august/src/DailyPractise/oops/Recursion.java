package DailyPractise.oops;

public class Recursion {

    public static void main(String[]args){
        sayhi(5);
    }
    static void sayhi(int n){
        if(n==0){
            System.out.println("stop");
        }else {
            System.out.println("HI");
            n--;
            sayhi(n);
        }
    }
}
//recursion is a method called initself