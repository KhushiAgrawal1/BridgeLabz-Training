import java.util.Scanner;

// Program to convert distance from feet to yards and miles
public class DistanceConversion
{
    public static void main(String args[])
    {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Read distance in feet
        double distanceInFeet = input.nextDouble();

        // Convert feet to yards
        double yards = distanceInFeet / 3;

        // Convert yards to miles
        double miles = yards / 1760;

        // Display result
        System.out.println("The distance in feet is " + distanceInFeet + " which is " + yards + " yards and " + miles + " miles");
    }
}
