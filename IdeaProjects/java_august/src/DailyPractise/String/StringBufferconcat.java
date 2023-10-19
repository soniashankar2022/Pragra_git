package DailyPractise.String;

public class StringBufferconcat {
    public static void main(String []args){
        StringBuffer s= new StringBuffer("sonia");
        s.append("soni");
        System.out.println(s);
    }
}
//this is because stringBuffer is mutable .so once string cretead the object with reference name sonia ..whatever action we are trying to do it  allow to perform.
//if we are trying to perform any changes with those changes are performed in the existing object.
