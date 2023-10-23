package DailyPractise.oops;

class lamp {
    //fields and variable
    boolean isOn;

    //method to turn light on
    void turnOn() {
        isOn = true;
        System.out.println("light on?" + isOn);
    }

    //method to turn light off
    void turnOff() {
        isOn = false;
        System.out.println("light on?" + isOn);
    }

    public static void main(String args[]) {
        lamp led = new lamp();
        lamp bulb = new lamp();

        led.turnOff();
        bulb.turnOn();
    }
}
