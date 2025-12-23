// Program Name : BMI Calculator for Team Members
// Description  : This program calculates the Body Mass Index (BMI) of
//                10 persons using their height and weight, determines
//                their BMI status, and displays the result in tabular form.

import java.util.Scanner;

public class BMICalculator
{
    // b. Method to calculate BMI and Status for each person
    public static String[][] calculateBMIAndStatus(double[][] data)
    {
        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++)
        {
            double weight = data[i][0];
            double heightCm = data[i][1];

            // Convert height from cm to meter
            double heightMeter = heightCm / 100;

            // BMI Formula
            double bmi = weight / (heightMeter * heightMeter);

            // Round BMI to 2 decimal places
            bmi = Math.round(bmi * 100.0) / 100.0;

            String status;

            // Determine BMI Status
            if (bmi <= 18.4)
                status = "Underweight";
            else if (bmi <= 24.9)
                status = "Normal";
            else if (bmi <= 39.9)
                status = "Overweight";
            else
                status = "Obese";

            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.valueOf(bmi);
            result[i][3] = status;
        }

        return result;
    }

    // c. Method that takes height and weight array and returns BMI details
    public static String[][] processBMI(double[][] data)
    {
        return calculateBMIAndStatus(data);
    }

    // d. Method to display BMI details in tabular format
    public static void displayResult(String[][] bmiData)
    {
        System.out.println("\nPerson\tHeight(cm)\tWeight(kg)\tBMI\tStatus");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < bmiData.length; i++)
        {
            System.out.println((i + 1) + "\t" +
                               bmiData[i][0] + "\t\t" +
                               bmiData[i][1] + "\t\t" +
                               bmiData[i][2] + "\t" +
                               bmiData[i][3]);
        }
    }

    // e. Main method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int numberOfPersons = 10;

        // a. Take user input for weight and height
        double[][] data = new double[numberOfPersons][2];

        for (int i = 0; i < numberOfPersons; i++)
        {
            System.out.println("\nEnter details for Person " + (i + 1));

            System.out.print("Enter weight (kg): ");
            data[i][0] = input.nextDouble();

            System.out.print("Enter height (cm): ");
            data[i][1] = input.nextDouble();
        }

        String[][] bmiResult = processBMI(data);
        displayResult(bmiResult);
    }
}
