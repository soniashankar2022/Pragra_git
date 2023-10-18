package oops;
 class methodreturntype {
     public static int square(int num){
         return num*num;
     }
//since the method is static we dont have to create a oject
     public static void main(String args[]){
        int result= square(10);
         System.out.println(result);
     }
 }