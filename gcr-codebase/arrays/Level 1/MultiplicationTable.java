// Program Name : Multiplication Table Program
// Description  : Prints multiplication table using array

import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask user to enter a number
        System.out.println("Enter number:");
        int number = input.nextInt();
		
        // Array to store multiplication results (1 to 10)
        // Index : 0 1 2 3 4 5 6 7 8 9
        int[] table = new int[10]; 

        // Store multiplication values in array
        for (int i = 1; i <= 10; i++)
        {
            table[i - 1] = number * i;
        }

        // Display the multiplication table
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }
    }
}
