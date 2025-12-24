// Program Name : TemperatureConverter
// Description  : Converts temperature between Celsius and Fahrenheit using functions

import java.util.Scanner;

public class TemperatureConverter
{
    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius)
    {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit)
    {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        if (choice == 1)
        {
            System.out.print("Enter temperature in Celsius: ");
            double c = sc.nextDouble();
            System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(c));
        }
        else if (choice == 2)
        {
            System.out.print("Enter temperature in Fahrenheit: ");
            double f = sc.nextDouble();
            System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(f));
        }
        else
        {
            System.out.println("Invalid choice");
        }
    }
}
