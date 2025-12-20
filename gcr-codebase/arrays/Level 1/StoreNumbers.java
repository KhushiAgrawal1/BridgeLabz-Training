// Program Name : Store Numbers and Sum Program
// Description  : Stores numbers until limit and finds sum

import java.util.Scanner;

public class StoreNumbers
{
    public static void main(String[] args)
    {
        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Array to store up to 10 numbers
        double[] numbers = new double[10];

        // Variable to store total sum
        double total = 0.0;

        // Index to track number of elements stored
        int index = 0;

        // Loop to take input until condition breaks
        while (true)
        {
            System.out.println("Enter a number:");
            double value = input.nextDouble();

            // Stop if value is zero/negative or array is full
            if (value <= 0 || index == 10)
            {
                break;
            }

            // Store value in array
            numbers[index] = value;
            index++;
        }

        // Loop to calculate sum of stored numbers
        for (int i = 0; i < index; i++)
        {
            total = total + numbers[i];
        }

        // Display the total sum
        System.out.println("Total = " + total);
    }
}
