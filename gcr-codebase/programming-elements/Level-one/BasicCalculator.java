import java.util.Scanner;

// Program to perform basic arithmetic operations
public class BasicCalculator
{
    public static void main(String args[])
    {
        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Read two floating point numbers
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();

        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Display the results
        System.out.println(
            "The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " +
            addition + ", " + subtraction + ", " + multiplication + ", and " + division );     
    }
}
