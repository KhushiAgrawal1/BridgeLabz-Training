// Program Name : CalendarDisplay
// Description  : This program displays the calendar for a given month and year
//                using the Gregorian calendar algorithm.

import java.util.Scanner;

public class CalendarDisplay
{
    // Method to check Leap Year
    public static boolean isLeapYear(int year)
    {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
        {
            return true;
        }
        return false;
    }

    // Method to get month name
    public static String getMonthName(int month)
    {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    // Method to get number of days in a month
    public static int getNumberOfDays(int month, int year)
    {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Check for February leap year
        if (month == 2 && isLeapYear(year))
        {
            return 29;
        }
        return days[month - 1];
    }

    // Method to get the first day of the month (Gregorian Calendar Algorithm)
    // 0 = Sunday, 1 = Monday, ..., 6 = Saturday
    public static int getFirstDay(int month, int year)
    {
        int d = 1;
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        return d0;
    }

    // Method to display calendar
    public static void displayCalendar(int month, int year)
    {
        String monthName = getMonthName(month);
        int totalDays = getNumberOfDays(month, year);
        int firstDay = getFirstDay(month, year);

        // Display month and year
        System.out.println("\n   " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // First for-loop for indentation
        for (int i = 0; i < firstDay; i++)
        {
            System.out.print("    ");
        }

        // Second for-loop to display days
        for (int day = 1; day <= totalDays; day++)
        {
            System.out.printf("%3d ", day);

            // Move to next line after Saturday
            if ((day + firstDay) % 7 == 0)
            {
                System.out.println();
            }
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter year: ");
        int year = input.nextInt();

        displayCalendar(month, year);
    }
}
