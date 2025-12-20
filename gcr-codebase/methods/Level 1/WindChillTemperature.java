// Program Name : Wind Chill Temperature Program
// Description  : Calculates wind chill temperature using temperature and wind speed

import java.util.Scanner;

public class WindChillTemperature
{
    // Method to calculate wind chill temperature
    public static double findWindChillTemperature(double temperature, double windSpeed)
    {
        // Wind chill temperature formula
        return 35.74 + 0.6215 * temperature
               + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args)
    {
        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take temperature input
        System.out.println("Enter temperature: ");
        double temperature = input.nextDouble();

        // Take wind speed input
        System.out.println("Enter windSpeed: ");
        double windSpeed = input.nextDouble();

        // Calculate wind chill temperature
        double result = findWindChillTemperature(temperature, windSpeed);

        // Display result
        System.out.println("WindChillTemperature: " + result);
    }
}
