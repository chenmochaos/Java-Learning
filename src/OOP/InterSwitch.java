package OOP;

public class InterSwitch {

    public static void main(String[] args) {

        Switchable[] devices = {new Light(), new Speaker()};
        for (Switchable device : devices) {
            device.turnOn();   // 不用管它是灯还是音箱，反正都能开
            device.turnOff();  // 也不用管，反正都能关
        }
    }
}

interface Switchable {
    void turnOn();

    void turnOff();
}

class Light implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Light is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is off");
    }
}

class Speaker implements Switchable {
    public void turnOn() {
        System.out.println("Speaker is on");
    }

    public void turnOff() {
        System.out.println("Speaker is off");
    }
}