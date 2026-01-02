package SmartHomeAutomationSystem;

public class AC extends Appliance implements Controllable {

    public void turnOn() {
        status = true;
        System.out.println("AC cooling started");
    }

    public void turnOff() {
        status = false;
        System.out.println("AC turned OFF");
    }
}
