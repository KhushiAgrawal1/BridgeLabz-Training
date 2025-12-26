import java.util.Scanner; // Import Scanner class for user input

class SimpleInterest {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the principal amount
        System.out.print("Enter Principal: ");
        double p = input.nextDouble();

        // Ask the user to enter the rate of interest
        System.out.print("Enter Rate: ");
        double r = input.nextDouble();

        // Ask the user to enter the time period
        System.out.print("Enter Time: ");
        double t = input.nextDouble();

        // Calculate simple interest
        double si = (p * r * t) / 100;

        // Display the simple interest
        System.out.println("Simple Interest = " + si);

        // Close the Scanner object
        input.close();
    }
}
