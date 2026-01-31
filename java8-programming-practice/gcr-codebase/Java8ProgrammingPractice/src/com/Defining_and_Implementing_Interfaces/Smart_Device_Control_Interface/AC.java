package com.Defining_and_Implementing_Interfaces.Smart_Device_Control_Interface;

class AC implements SmartDevice {
    public void turnOn() {
        System.out.println("AC turned ON");
    }

    public void turnOff() {
        System.out.println("AC turned OFF");
    }
}
