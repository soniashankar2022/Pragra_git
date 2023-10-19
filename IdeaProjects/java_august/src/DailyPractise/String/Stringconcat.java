package DailyPractise.String;

public class Stringconcat {
    public static void main(String []args){
        String s= new String("sonia");
        s.concat("soni");
        System.out.println(s);
    }
}
//this is because string is immutable .so once string cretead the object with reference name sonia ..whatever action we are trying to do it wont allow to perform.
//if we are trying to perform any changes with those changes the new object will be ceated .
//we are not assigning the new object for any varaible so it is eligible for garbage collection