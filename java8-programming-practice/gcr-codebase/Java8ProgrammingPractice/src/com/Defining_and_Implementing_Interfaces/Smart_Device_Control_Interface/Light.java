package com.Defining_and_Implementing_Interfaces.Smart_Device_Control_Interface;

class Light implements SmartDevice {
    public void turnOn() {
        System.out.println("Light turned ON");
    }

    public void turnOff() {
        System.out.println("Light turned OFF");
    }
}
