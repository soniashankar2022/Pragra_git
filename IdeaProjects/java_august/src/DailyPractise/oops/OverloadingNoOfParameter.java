package DailyPractise.oops;
 class OverloadingNoOfParameter {
     public static void sum(int a){
         System.out.println("one parameter "+ a);

     }

     public static void sum(int a,int b){
         System.out.println("two parameter "+ a+"and"+ b);

     }

     public static void main(String args[]){
         sum(10);
         sum(2,4);

     }

  }
