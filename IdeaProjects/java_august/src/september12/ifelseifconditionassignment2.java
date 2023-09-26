package september12;

public class ifelseifconditionassignment2 {

    public static void main(String[] args) {
        int age = 23;
        String License = "g";
        double BAL = 1.09;

         if (age < 19 && License.equals("g")) {
            System.out.println("Youth alcohol level should be 0.0.");
        } else if (age > 19 && License.equals("g")) {
            System.out.println("Youth alcohol level should be 0.05.");
        } else if (age > 19 && License.equals("g") && BAL > 0.05) {
            System.out.println("The person is ticketed.");

        }
    }
}
