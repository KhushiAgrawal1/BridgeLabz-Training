// Program Name : Simple Interest Program
// Description  : Calculates simple interest using principal, rate and time

import java.util.Scanner;

public class SimpleInterest
{
    // Method to calculate Simple Interest
    public static double calculateSI(double p, double r, double t)
    {
        // Formula: (Principal * Rate * Time) / 100
        return (p * r * t) / 100;
    }

    public static void main(String[] args)
    {
        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take principal amount
        System.out.println("Enter principal amount: ");
        double principal = input.nextDouble(); 

        // Take rate of interest
        System.out.println("Enter rate: ");
        double rate = input.nextDouble();

        // Take time period
        System.out.println("Enter time: ");
        double time = input.nextDouble();
    
        // Call method to calculate simple interest
        double si = calculateSI(principal, rate, time);

        // Display the result
        System.out.println("Simple Interest: " + si);
    }
}
