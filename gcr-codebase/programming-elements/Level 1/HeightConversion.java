import java.util.Scanner;

// Program to convert height from centimeters to feet and inches

public class HeightConversion
{
    public static void main(String args[])
    {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Read height in centimeters
        double cm = input.nextDouble();

        // Convert cm to inches
        double inches = cm / 2.54;

        // Convert inches to feet
        double feet = inches / 12;

        // Display result
        System.out.println("Your Height in cm is " + cm + " while in feet is " + feet + " and inches is " + inches );
    }
}
