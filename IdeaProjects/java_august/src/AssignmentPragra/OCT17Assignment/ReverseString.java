package AssignmentPragra.OCT17Assignment;


public class ReverseString {
    public static void main(String[] args) {
        String str="Sonia jayashankar";

        //we are now converting the string into string array
        String a[]=str.split(" ");
        for(int i=0;i<a.length;i++){

            System.out.print(a[i] + " ");

        }
        //reverse format
        System.out.println(" ");
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i] + " " );
        }
    }


}
