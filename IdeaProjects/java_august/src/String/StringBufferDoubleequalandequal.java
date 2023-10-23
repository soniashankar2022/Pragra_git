package String;

public class StringBufferDoubleequalandequal {
    public static void main(String []args) {
        StringBuffer s1=new StringBuffer("sonia");
        StringBuffer s2=new StringBuffer("sonia");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println("jenkin changes");
    }}
//// == always ment for reference comparison. if both are pointing to same object then true
//in string buffer the equal method is not overriden.
//when we call sb .equals we are calling object class equal method is called so it is ment for reference comparison.