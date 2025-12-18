// Program Name : Leap Year Program using Single if Condition
// Description  : This program determines Leap Year using logical operators && and || in a single if statement

import java.util.Scanner;

public class LeapYearLogical
{
    public static void main(String[] args)
    {
        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Ask user to enter year
        System.out.println("Enter year:");
        int year = input.nextInt();

        // Single if condition to check leap year
        if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
        {
            System.out.println("Year is a Leap Year");
        }
        else if (year >= 1582)
        {
            System.out.println("Year is not a Leap Year");
        }
        else
        {
            System.out.println("Year should be greater than or equal to 1582");
        }
    }
}
