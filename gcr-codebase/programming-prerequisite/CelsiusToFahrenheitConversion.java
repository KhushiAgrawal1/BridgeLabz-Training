import java.util.Scanner; // Import Scanner class for user input

public class CelsiusToFahrenheitConversion {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Ask the user to enter temperature in Celsius
        System.out.println("Enter temperature in Celsius: ");

        // Read Celsius temperature
        int celsius = input.nextInt();

        // Convert Celsius to Fahrenheit
        int fahrenheit = (celsius * 9 / 5) + 32;

        // Display the temperature in Fahrenheit
        System.out.println("Temperature in Fahrenheit : " + fahrenheit);

        // Close the Scanner object
        input.close();
    }
}
