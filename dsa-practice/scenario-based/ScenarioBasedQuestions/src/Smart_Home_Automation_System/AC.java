package Smart_Home_Automation_System;

public class AC extends Appliance implements Controllable {

    public void turnOn() {
        isOn = true;
        System.out.println("AC Cooling Started");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("AC OFF");
    }
}

