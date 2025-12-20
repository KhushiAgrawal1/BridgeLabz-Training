// Program Name : BMI Calculation Program
// Description  : Calculates BMI of multiple persons and determines their health status

import java.util.Scanner; // Import Scanner class for user input

public class BMICalculation
{
    public static void main (String[] args)
    {
        // Create Scanner object to read input
        Scanner input = new Scanner(System.in);
        
        // Ask user to enter number of persons
        System.out.println("Enter number of persons: ");
        int persons = input.nextInt();
        
        // Arrays to store weight, height, BMI, and health status
        double[] weight = new double[persons];
        double[] height = new double[persons];
        double[] bmi = new double[persons];
        String[] status = new String[persons];
        
        // Input weight of each person
        System.out.println("Enter weight of persons: ");
        for (int i = 0; i < weight.length; i++)
        {		
            weight[i] = input.nextDouble();
        }

        // Input height of each person
        System.out.println("Enter height of persons: ");
        for (int i = 0; i < height.length; i++)
        {		
            height[i] = input.nextDouble();
        }
        
        // Calculate BMI and determine health status
        for (int i = 0; i < persons; i++)
        {		
            // BMI formula: weight / (height * height)
            bmi[i] = weight[i] / (height[i] * height[i]);
		      
            // Determine BMI category
            if (bmi[i] <= 18.4)
            {
                status[i] = "Underweight";
            }
            else if (bmi[i] >= 18.5 && bmi[i] <= 24.9)
            {
                status[i] = "Normal";
            }
            else if (bmi[i] >= 25.0 && bmi[i] <= 39.9)
            {
                status[i] = "Overweight";
            }
            else
            {
                status[i] = "Obese";
            }
        }

        // Display BMI details of each person
        System.out.println("BMI details of persons: ");
        for (int i = 0; i < persons; i++)
        {
            System.out.println("Person " + (i + 1));
            System.out.println("Weight: " + weight[i] + " kg");
            System.out.println("Height: " + height[i] + " meters");
            System.out.println("BMI: " + bmi[i]);
            System.out.println("Status: " + status[i]);
            System.out.println("-----------------------");
        }
    }
}
