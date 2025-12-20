// Program Name : 
// Description : 

import java.util.Scanner;

public class FriendsComparison
{
    public static void main (String[] args)
	{
	    Scanner input = new Scanner(System.in);
		
		String[] names = {"Amar", "Akbar", "Anthony"};
		int[] age = new int[3];
		double[] height = new double[3];
		
		for (int i = 0; i < 3; i++)
		{
			System.out.println("Enter age of " + names[i]);
			age[i] = input.nextInt();
			
			System.out.println("Enter height of " + names[i]);
			height[i] = input.nextDouble();			
		}
		
		int youngestIndex = 0;
		int tallestIndex = 0;
		
		for (int i = 1; i < 3; i++)
		{
		    if (age[i] < age[youngestIndex])
			{
			    youngestIndex = i;
			}
			
			if (height[i] > height[tallestIndex])
			{
			    tallestIndex = i;
			}
		}

        System.out.println("Youngest: " + names[youngestIndex]);
		System.out.println("Tallest: " + names[tallestIndex]);
	}
}	
		
		