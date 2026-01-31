package com.Static_Methods_in_Interfaces.Unit_Conversion_Tool;

interface UnitConverter {

    // Kilometer to Miles
    static double kmToMiles(double km) {
        return km * 0.621371;
    }

    // Miles to Kilometer
    static double milesToKm(double miles) {
        return miles / 0.621371;
    }

    // Kilogram to Pounds
    static double kgToLbs(double kg) {
        return kg * 2.20462;
    }

    // Pounds to Kilogram
    static double lbsToKg(double lbs) {
        return lbs / 2.20462;
    }
}
