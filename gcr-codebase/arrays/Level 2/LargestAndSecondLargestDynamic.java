// Program Name : 
// Description : 

import java.util.Scanner;

public class LargestAndSecondLargestDynamic
{
    public static void main (String[] args)
	{
	    Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int number = input.nextInt();
		
		int maxDigit = 10;
		int[] array = new int[maxDigit];
		int index = 0;
		
		while (number != 0)
		{
			if (index == maxDigit)
			{
			    maxDigit += 10;
				int[] temp = new int [maxDigit];
				for (int i = 0; i < index; i++)
				{
					temp[i] = array[i];
				}	
			}
		    array[index] = number % 10;
			number = number / 10;
			index++;			
		}	
		
		int largest = 0;
		int secondLargest = 0;
			
		for (int i = 1; i < index; i++)
		{
		    if (array[i] > array[largest])
			{
			    largest = i;
			}
		}
		
		System.out.println("Largest: " + array[largest]);
		
		for (int i = 1; i < index; i++)
		{
		    if (array[i] > array[secondLargest] && array[i] != array[largest])
			{
			    secondLargest = i;
			}
		}
		
		System.out.println("Second Largest: " + array[secondLargest]);
	}
}	