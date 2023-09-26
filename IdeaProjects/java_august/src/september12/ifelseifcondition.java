package september12;

public class ifelseifcondition {

    public static void main(String[] args) {
        int score = 25;
        if (score < 40) {
            System.out.println("student is fail");
        } else if (score > 40 && score < 60) {
            System.out.println("B grade");

        } else if (score > 60 && score < 80) {
            System.out.println("A grade");

        } else if (score > 80) {
            System.out.println("A+ grade ..");
        } else {
            System.out.println("Nothing..");
        }
    }
}
