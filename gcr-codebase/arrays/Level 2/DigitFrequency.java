// Program Name : Frequency of Digits in a Number
// Description  : This program takes a number as input, stores its digits in an array,
//                finds the frequency of each digit using another array and displays it

import java.util.Scanner;

public class DigitFrequency
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int temp = number;

        // Step 1: Find count of digits
        int count = 0;
        while(temp != 0)
        {
            count++;
            temp = temp / 10;
        }

        // Step 2: Store digits in array
        int[] digits = new int[count];
        temp = number;

        for(int i = 0; i < count; i++)
        {
            digits[i] = temp % 10;
            temp = temp / 10;
        }

        // Step 3: Frequency array for digits 0 to 9
        int[] frequency = new int[10];

        // Step 4: Find frequency of each digit
        for(int i = 0; i < count; i++)
        {
            frequency[digits[i]]++;
        }

        // Step 5: Display frequency
        System.out.println("\nDigit Frequency:");
        for(int i = 0; i < 10; i++)
        {
            if(frequency[i] > 0)
            {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }

        input.close();
    }
}
