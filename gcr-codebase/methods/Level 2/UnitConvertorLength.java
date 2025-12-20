// Program Name : Length Unit Convertor
// Description  : This program converts length units between yards, feet, meters, inches, and centimeters.

public class UnitConvertorLength {

    // Method to convert Yards to Feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3; // Conversion factor
        return yards * yards2feet;
    }

    // Method to convert Feet to Yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333; // Conversion factor
        return feet * feet2yards;
    }

    // Method to convert Meters to Inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701; // Conversion factor
        return meters * meters2inches;
    }

    // Method to convert Inches to Meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254; // Conversion factor
        return inches * inches2meters;
    }

    // Method to convert Inches to Centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54; // Conversion factor
        return inches * inches2cm;
    }

    public static void main(String[] args) {

        // Sample input values
        double yards = 5;
        double feet = 12;
        double meters = 2;
        double inches = 10;

        // Display conversion results
        System.out.println("Yards to Feet: " + convertYardsToFeet(yards));
        System.out.println("Feet to Yards: " + convertFeetToYards(feet));
        System.out.println("Meters to Inches: " + convertMetersToInches(meters));
        System.out.println("Inches to Meters: " + convertInchesToMeters(inches));
        System.out.println("Inches to Centimeters: " + convertInchesToCentimeters(inches));
    }
}
