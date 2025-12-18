// Program Name : Calculator Program using Switch Case
// Description  : This program performs basic arithmetic operations using switch case

import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Get first number
        System.out.println("Enter first number:");
        double first = input.nextDouble();

        // Get second number
        System.out.println("Enter second number:");
        double second = input.nextDouble();

        // Get operator
        System.out.println("Enter operator (+, -, *, /):");
        String op = input.next();

        // Perform operation using switch case
        switch (op)
        {
            case "+":
                System.out.println("Result = " + (first + second));
                break;

            case "-":
                System.out.println("Result = " + (first - second));
                break;

            case "*":
                System.out.println("Result = " + (first * second));
                break;

            case "/":
                System.out.println("Result = " + (first / second));
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }
}
