package DailyPractise.String;

public class Stringconcat {
    public static void main(String []args){
        String s= new String("sonia");
        s.concat("soni");
        System.out.println(s);
    }
}
//this is because string is immutable .so once string cretead the object with reference name sonia ..whatever action we are trying to do it wont allow to perform.