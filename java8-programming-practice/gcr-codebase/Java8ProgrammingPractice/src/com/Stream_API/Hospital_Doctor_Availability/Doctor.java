package com.Stream_API.Hospital_Doctor_Availability;

public class Doctor {
	String name;
	String speciality;
	boolean availableOnWeekend;
	public Doctor(String name, String speciality, boolean availableOnWeekend ) {
		this.name = name;
		this.speciality = speciality;
		this.availableOnWeekend = availableOnWeekend;
	}
	@Override
	public String toString() {
		return "name : " + name + " speciality : " + speciality + " availability : " + availableOnWeekend;
	}	
}
