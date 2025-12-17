// Program to convert distance from feet to yards and miles

import java.util.Scanner;

public class DistanceConversion
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        // Read distance in feet
        double distanceInFeet = input.nextDouble();

        // Convert to yards and miles
        double yards = distanceInFeet / 3;
        double miles = yards / 1760;

        // Display result
        System.out.println("The distance in yards is " + yards + " while the distance in miles is " + miles);        
    }
}
