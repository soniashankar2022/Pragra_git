package DailyPractise.oops;

public class NoArgConstructor {
    int i;

    private NoArgConstructor(){
        i=5;
        System.out.println("Constructor is called");

    }
    public static void main(String args[]){
        NoArgConstructor object=new NoArgConstructor();
        int result= object.i;
        System.out.println(result);
    }
}
