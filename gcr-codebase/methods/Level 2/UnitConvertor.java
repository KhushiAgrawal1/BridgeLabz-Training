// Program Name : Unit Convertor
// Description  : This program converts units between kilometers & miles and meters & feet.

import java.util.Scanner; // Import Scanner class for user input (not used here, but available)

public class UnitConvertor
{
    // Method to convert kilometers to miles
    public static double convertKilometerToMiles(double km)
    {
        double km2miles = 0.621371; // Conversion factor
        return km * km2miles;    
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKilometer(double ml)
    {
        double miles2km = 1.60934; // Conversion factor
        return ml * miles2km;        
    }

    // Method to convert meters to feet
    public static double convertMeterToFeet(double mt)
    {
        double meters2feet = 3.28084; // Conversion factor
        return mt * meters2feet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeter(double ft)
    {
        double feet2meters = 0.3048; // Conversion factor
        return ft * feet2meters;        
    }

    public static void main(String[] args)
    {
        double km = 1000; // Example kilometers
        double ml = 2;    // Example miles
        double mt = 500;  // Example meters
        double ft = 6;    // Example feet

        // Display conversion results
        System.out.println("Kilometers to miles: " + convertKilometerToMiles(km));
        System.out.println("Miles to kilometers: " + convertMilesToKilometer(ml));
        System.out.println("Meters to feet: " + convertMeterToFeet(mt));
        System.out.println("Feet to meters: " + convertFeetToMeter(ft));
    }
} 
