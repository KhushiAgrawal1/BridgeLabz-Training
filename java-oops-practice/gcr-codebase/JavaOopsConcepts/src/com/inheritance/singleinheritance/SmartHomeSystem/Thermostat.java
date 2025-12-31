package com.inheritance.singleinheritance.SmartHomeSystem;

class Thermostat extends Device {
	
	String temperatureSetting;


	Thermostat(int deviceId, String status, String temperatureSetting) {
		
		super(deviceId, status);
		this.temperatureSetting = temperatureSetting;
		
	}
	
    void displayStatus() {
		super.displayStatus();	
		System.out.println("Temperature setting : " + temperatureSetting);

	}

}
