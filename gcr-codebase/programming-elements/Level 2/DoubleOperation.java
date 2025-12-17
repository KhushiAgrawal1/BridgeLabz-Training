// Program to demonstrate double operation

import java.util.Scanner;

public class DoubleOperation
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        // Read double values
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // Double operations
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        // Display results
        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
    }
}
