package com.Smart_Home_Automation_System;

public class SmartHomeMain {
    public static void main(String[] args) {
        Controllable device = new AC();
        device.turnOn();
    }
}

