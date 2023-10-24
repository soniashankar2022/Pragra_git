package AssignmentPragra.Assignment4OOPS;

public interface Animal {
    void Feed();

    void makesound();

    public interface Swimmable {
        void swim();

    }

    public interface Climabable {
        void climb();
    }

    public class Lion implements Animal {
        public void Feed() {
            System.out.println(" Animal Feeding");
        }

        public void makesound() {
            System.out.println("Lion roaring");
        }


    }

    public class Monkey implements Climabable, Animal {

        public void climb() {
            System.out.println("Monkey can Climb");
        }


        public void Feed() {
            System.out.println("Monkey can eat");

        }


        public void makesound() {
            System.out.println("Monkey can make sound");
        }
    }

    public class Penguin implements Swimmable, Animal {

        public void swim() {
            System.out.println("Penguin can Swim");

        }

        public void makesound() {
            System.out.println("Penguin can make sound");
        }


        public void Feed() {
            System.out.println("penguin can eat");

        }
    }

    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.Feed();
        lion.makesound();

        Monkey monkey = new Monkey();
        monkey.climb();
        monkey.Feed();
        monkey.makesound();


        Penguin penguin = new Penguin();
        penguin.swim();
        penguin.Feed();
        penguin.makesound();
    }
}

