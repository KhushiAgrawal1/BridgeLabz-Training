// Program Name : Day Of Week Program
// Description  : This program takes month, day and year as
//                command-line arguments and prints the
//                day of the week using Gregorian calendar formula
// Output       : 0 = Sunday, 1 = Monday, 2 = Tuesday, ... 6 = Saturday

public class DayOfWeek
{
    public static void main(String[] args)
    {
        // Read command-line arguments
        int m = Integer.parseInt(args[0]); // month
        int d = Integer.parseInt(args[1]); // day
        int y = Integer.parseInt(args[2]); // year

        // Step 1: Calculate y0
        int y0 = y - (14 - m) / 12;

        // Step 2: Calculate x
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        // Step 3: Calculate m0
        int m0 = m + 12 * ((14 - m) / 12) - 2;

        // Step 4: Calculate d0 (day of week)
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // Print result
        System.out.println("Day of the week = " + d0);
    }
}
