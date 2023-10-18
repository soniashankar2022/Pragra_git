package oops;
 class methodprameter {

     //method with no parameter
     public void display(){
         System.out.println("here the method is having no parameter");

     }
     public void display1(int a){
         System.out.println("here the method is havinf a single parameter"  +   a);
     }

     public static void main(String args[]){
         methodprameter object =new methodprameter();
         object.display();
         object.display1(10);

     }
 }