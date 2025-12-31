package com.inheritance.singleinheritance.SmartHomeSystem;

public class SmartHomeSystem {

	public static void main(String[] args) {
	
		Thermostat t1 = new Thermostat(1465, "on", "decrease");
		t1.displayStatus();
}
}
