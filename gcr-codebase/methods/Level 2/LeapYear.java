// Program Name : Leap Year Checker
// Description  : This program checks whether a given year is a leap year or not.


import java.util.Scanner; // Import Scanner class to take input from user

public class LeapYear
{
    // Method to check if a year is a leap year
    public static boolean leapYearCheck(int year)
    {
        // Leap year calculation is only valid from year 1582 onwards
        if (year < 1582)
        {
            return false; // Return false if year is before 1582
        }

        // Leap year logic:
        // A year is a leap year if divisible by 4 and not divisible by 100, or divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
        {
            return true; // It's a leap year
        }

        return false; // Not a leap year
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // Create Scanner object for input

        System.out.println("Enter year:"); // Prompt user to enter a year
        int year = input.nextInt();         // Read year input from user

        boolean result = leapYearCheck(year); // Call method to check if leap year

        // Display result based on boolean returned from method
        if (result)
        {
            System.out.println("Leap year"); // If true, print "Leap year"
        }
        else
        {
            System.out.println("Not a Leap year"); // If false, print "Not a Leap year"
        }

        input.close(); // Close the Scanner to free resources
    }
}
