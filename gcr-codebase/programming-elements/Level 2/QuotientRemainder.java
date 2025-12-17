// Program to find quotient and remainder

import java.util.Scanner;

public class QuotientRemainder
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        // Read two numbers
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        // Calculate quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Display result
        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + number1 + " and " + number2);
    }
}
