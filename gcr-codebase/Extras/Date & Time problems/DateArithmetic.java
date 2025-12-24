// Program Name : DateArithmetic
// Description  : Performs date addition and subtraction operations

import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter date (yyyy-mm-dd): ");
        String dateInput = input.nextLine();

        LocalDate date = LocalDate.parse(dateInput);

        LocalDate result = date
                .plusDays(7)
                .plusMonths(1)
                .plusYears(2)
                .minusWeeks(3);

        System.out.println("Final Date after operations: " + result);
    }
}
