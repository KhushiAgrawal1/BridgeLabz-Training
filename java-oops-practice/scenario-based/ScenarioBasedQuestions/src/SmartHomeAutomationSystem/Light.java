package SmartHomeAutomationSystem;

public class Light extends Appliance implements Controllable {

    public void turnOn() {
        status = true;
        System.out.println("Light turned ON");
    }

    public void turnOff() {
        status = false;
        System.out.println("Light turned OFF");
    }
}
