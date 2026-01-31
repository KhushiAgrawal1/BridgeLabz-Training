package com.Static_Methods_in_Interfaces.Unit_Conversion_Tool;

public class LogisticsApp {
    public static void main(String[] args) {

        System.out.println("10 km = " + UnitConverter.kmToMiles(10) + " miles");
        System.out.println("5 miles = " + UnitConverter.milesToKm(5) + " km");

        System.out.println("50 kg = " + UnitConverter.kgToLbs(50) + " lbs");
        System.out.println("110 lbs = " + UnitConverter.lbsToKg(110) + " kg");
    }
}
