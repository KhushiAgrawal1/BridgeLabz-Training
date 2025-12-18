// Program Name : BMI Calculation Program
// Description  : This program calculates the BMI of a person and displays the weight status

import java.util.Scanner;

public class BMICalculation
{
    public static void main(String[] args)
    {
        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Take weight input in kilograms
        System.out.println("Enter weight in kg:");
        double weight = input.nextDouble();

        // Take height input in centimeters
        System.out.println("Enter height in cm:");
        double heightCm = input.nextDouble();

        // Convert height from cm to meters
        double heightMeter = heightCm / 100;

        // Calculate BMI
        double bmi = weight / (heightMeter * heightMeter);

        // Display BMI value
        System.out.println("BMI = " + bmi);

        // Determine weight status based on BMI
        if (bmi <= 18.4)
        {
            System.out.println("Status : Underweight");
        }
        else if (bmi >= 18.5 && bmi <= 24.9)
        {
            System.out.println("Status : Normal");
        }
        else if (bmi >= 25.0 && bmi <= 39.9)
        {
            System.out.println("Status : Overweight");
        }
        else
        {
            System.out.println("Status : Obese");
        }
    }
}
