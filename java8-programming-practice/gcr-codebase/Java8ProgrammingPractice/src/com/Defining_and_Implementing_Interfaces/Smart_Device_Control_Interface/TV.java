package com.Defining_and_Implementing_Interfaces.Smart_Device_Control_Interface;

class TV implements SmartDevice {
    public void turnOn() {
        System.out.println("TV turned ON");
    }

    public void turnOff() {
        System.out.println("TV turned OFF");
    }
}

