package september12;

public class ifelseifconditionassignment {

    public static void main(String[] args) {
        int age = 19;

        if (age == 16) {
            System.out.println("you cannot drive");
        } else if (age >= 16 && age <= 19) {
            System.out.println("You cannot drive on 400 highways");
        } else if (age > 19 && age < 65) {
            System.out.println("You are eligible to drive");
        } else  {
            System.out.println("Need to take permission from Government");

        }
    }
}
