/*
 Program Name : Maya's BMI Fitness Tracker
 Description  : This program calculates the Body Mass Index (BMI)
                based on height and weight entered by the user and
                displays the BMI category using if-else conditions.
 Formula      : BMI = weight / (height * height)
*/

import java.util.Scanner;

public class BMIFitnessTracker {
    public static void main(String[] args) {

        // Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Input height in meters
        System.out.print("Enter height in meters: ");
        double heightInMeters = input.nextDouble();

        // Input weight in kilograms
        System.out.print("Enter weight in kilograms: ");
        double weightInKg = input.nextDouble();

        // Calculate BMI using formula
        double bmi = weightInKg / (heightInMeters * heightInMeters);

        // Display BMI value
        System.out.println("Your BMI is: " + bmi);

        // Determine BMI category using if-else
        if (bmi < 18.5) {
            System.out.println("BMI Category: Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("BMI Category: Normal");
        } else {
            System.out.println("BMI Category: Overweight");
        }

        input.close();
        
    }
}
