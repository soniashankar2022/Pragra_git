package september26;

public class computer {
    String colour;
    int ram;

    void calculate() {
        System.out.println("calculating");
    }

    void surfinternet() {
        System.out.println("opening the internet");
    }

    public static void main(String args[]) {
        computer computer = new computer();
        computer.colour = "Blue";
        computer.ram = 512;


    }
}
