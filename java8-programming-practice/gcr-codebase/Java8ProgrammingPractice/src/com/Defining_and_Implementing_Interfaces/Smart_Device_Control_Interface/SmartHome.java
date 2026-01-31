package com.Defining_and_Implementing_Interfaces.Smart_Device_Control_Interface;

public class SmartHome {
    public static void main(String[] args) {

        SmartDevice light = new Light();
        SmartDevice ac = new AC();
        SmartDevice tv = new TV();

        light.turnOn();
        ac.turnOn();
        tv.turnOn();

        light.turnOff();
        ac.turnOff();
        tv.turnOff();
    }
}

