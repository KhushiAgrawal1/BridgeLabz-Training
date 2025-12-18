// Program Name : Leap Year Program using Multiple if-else Statements
// Description  : This program checks whether a given year is a Leap Year based on Gregorian calendar rules (year >= 1582)

import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args)
    {
        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Ask user to enter year
        System.out.println("Enter year:");
        int year = input.nextInt();

        // Check if year is valid for Gregorian calendar
        if (year >= 1582)
        {
            // Year divisible by 400
            if (year % 400 == 0)
            {
                System.out.println("Year is a Leap Year");
            }
            // Year divisible by 100 but not 400
            else if (year % 100 == 0)
            {
                System.out.println("Year is not a Leap Year");
            }
            // Year divisible by 4 but not 100
            else if (year % 4 == 0)
            {
                System.out.println("Year is a Leap Year");
            }
            // All other years
            else
            {
                System.out.println("Year is not a Leap Year");
            }
        }
        else
        {
            System.out.println("Year should be greater than or equal to 1582");
        }
    }
}
