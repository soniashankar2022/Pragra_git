package DailyPractise.String;

public class StringDoubleequalandequal {
    public static void main(String []args) {
        String s1=new String("sonia");
        String s2=new String("sonia");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }}
// == always ment for reference comparison. if both are pointing to same object then true

//.equals -->object class equals() ment for reference/address comparison

//in string class equals method is overridenfor content comparison