// Program Name : DateComparison
// Description  : Compares two dates using LocalDate methods

import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first date (yyyy-mm-dd): ");
        LocalDate date1 = LocalDate.parse(input.nextLine());

        System.out.println("Enter second date (yyyy-mm-dd): ");
        LocalDate date2 = LocalDate.parse(input.nextLine());

        if (date1.isBefore(date2))
        {
            System.out.println("First date is BEFORE second date");
        }
        else if (date1.isAfter(date2))
        {
            System.out.println("First date is AFTER second date");
        }
        else if (date1.isEqual(date2))
        {
            System.out.println("Both dates are SAME");
        }
    }
}
