import java.util.Scanner; // Import Scanner class for user input

class PowerCalculation {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the base number
        System.out.print("Enter base number: ");
        double base = input.nextDouble();

        // Ask the user to enter the exponent
        System.out.print("Enter exponent: ");
        double exponent = input.nextDouble();

        // Calculate base raised to the power of exponent
        double result = Math.pow(base, exponent);

        // Display the result
        System.out.println("Result = " + result);

        // Close the Scanner object
        input.close();
    }
}
