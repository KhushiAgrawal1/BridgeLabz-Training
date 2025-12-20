// Program Name : Body Mass Index (BMI) Calculator
// Description : This program calculates and displays the BMI and health status of 10 individuals using their height and weight.

import java.util.Scanner;

public class BMICalculator
{
    // Method to calculate BMI for each person and store in 3rd column
    public static void calculateBMI(double[][] data)
    {
        for (int i = 0; i < data.length; i++)
        {
            double weight = data[i][0];          // weight in kg
            double heightCm = data[i][1];        // height in cm
            double heightM = heightCm / 100.0;   // convert cm to meter

            data[i][2] = weight / (heightM * heightM); // BMI
        }
    }

    // Method to determine BMI status
    public static String[] getBMIStatus(double[][] data)
    {
        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++)
        {
            double bmi = data[i][2];

            if (bmi <= 18.4)
            {
                status[i] = "Underweight";
            }
            else if (bmi >= 18.5 && bmi <= 24.9)
            {
                status[i] = "Normal";
            }
            else if (bmi >= 25.0 && bmi <= 39.9)
            {
                status[i] = "Overweight";
            }
            else
            {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // 2D array: 10 rows, 3 columns (weight, height, BMI)
        double[][] persons = new double[10][3];

        // Taking user input
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Enter details for Person " + (i + 1));

            System.out.print("Weight (kg): ");
            persons[i][0] = input.nextDouble();

            System.out.print("Height (cm): ");
            persons[i][1] = input.nextDouble();
        }

        // Calculate BMI
        calculateBMI(persons);

        // Get BMI status
        String[] bmiStatus = getBMIStatus(persons);

        // Display result
        System.out.println("\nPerson\tWeight\tHeight\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++)
        {
            System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%s%n",
                    (i + 1),
                    persons[i][0],
                    persons[i][1],
                    persons[i][2],
                    bmiStatus[i]);
        }

        input.close();
    }
}
