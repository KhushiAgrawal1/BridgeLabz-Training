package com.Smart_Home_Automation_System;

public class Light extends Appliance implements Controllable {

    public void turnOn() {
        isOn = true;
        System.out.println("Light ON");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Light OFF");
    }
}

