// Program Name : 
// Description : 

import java.util.Scanner;

public class BMICalculation
{
    public static void main (String[] args)
	{
	    Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of persons: ");
		int persons = input.nextInt();
		
		double[] weight = new double[persons];
		double[] height = new double[persons];
		double[] bmi = new double[persons];
		String[] status = new String[persons];
		
		System.out.println("Enter weight of persons: ");
		for (int i = 0; i < weight.length; i++)
		{		
			weight[i] = input.nextDouble();
		}

		System.out.println("Enter height of persons: ");
		for (int i = 0; i < height.length; i++)
		{		
			height[i] = input.nextDouble();
		}
		
		for (int i = 0; i < persons; i++)
		{		
			bmi[i] = weight[i] / (height[i] * height[i]);
		      
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

        System.out.println("BMI details of persons: ");
		for (int i = 0; i < persons; i++)
		{
		    System.out.println("Person " + (i + 1));
		    System.out.println("weight: " + weight[i] + "kg");
			System.out.println("height: " + height[i] + "meters");
			System.out.println("bmi: " + bmi[i]);
			System.out.println("status: " + status[i]);
			System.out.println("-----------------------");
		}
	}
}	