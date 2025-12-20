// Program Name: BMI Calculation Using Multi-Dimensional Array
// Description : This program calculates BMI for multiple persons using a 2D array

import java.util.Scanner;

public class BMIMultiDimensionalArray
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Take input for number of persons
        System.out.print("Enter number of persons: ");
        int number = input.nextInt();

        // 2D array to store weight, height and BMI
        // index 0 -> weight, index 1 -> height, index 2 -> BMI
        double[][] personData = new double[number][3];

        // Array to store weight status
        String[] weightStatus = new String[number];

        // Taking input for weight and height
        for(int i = 0; i < number; i++)
        {
            System.out.println("\nEnter details for person " + (i + 1));

            System.out.print("Enter weight (kg): ");
            double weight = input.nextDouble();

            if(weight <= 0)
            {
                System.out.println("Invalid weight. Enter again.");
                i--;
                continue;
            }

            System.out.print("Enter height (cm): ");
            double height = input.nextDouble();

            if(height <= 0)
            {
                System.out.println("Invalid height. Enter again.");
                i--;
                continue;
            }

            // Store weight and height
            personData[i][0] = weight;
            personData[i][1] = height;
        }

        // Calculate BMI and determine weight status
        for(int i = 0; i < number; i++)
        {
            double heightInMeter = personData[i][1] / 100;
            double bmi = personData[i][0] / (heightInMeter * heightInMeter);

            personData[i][2] = bmi;

            if(bmi <= 18.4)
            {
                weightStatus[i] = "Underweight";
            }
            else if(bmi >= 18.5 && bmi <= 24.9)
            {
                weightStatus[i] = "Normal";
            }
            else if(bmi >= 25.0 && bmi <= 39.9)
            {
                weightStatus[i] = "Overweight";
            }
            else
            {
                weightStatus[i] = "Obese";
            }
        }

        // Display result
        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");

        for(int i = 0; i < number; i++)
        {
            System.out.println(
                personData[i][1] + "\t\t" +
                personData[i][0] + "\t\t" +
                String.format("%.2f", personData[i][2]) + "\t\t" +
                weightStatus[i]
            );
        }

        sc.close();
    }
}
