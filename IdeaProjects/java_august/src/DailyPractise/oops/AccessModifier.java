package dailypractise.oops;

public class AccessModifier {

    private String name;

    // getter method
    public String getName() {
        return this.name;
    }

    // setter method
    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] main) {
        AccessModifier d = new AccessModifier();

        // access the private variable using the getter and setter
        d.setName("Programiz");
        d.getName();
        System.out.println(d.getName());

    }
}

