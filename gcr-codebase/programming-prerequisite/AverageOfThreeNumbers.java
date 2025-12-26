import java.util.Scanner; // Import Scanner class for user input

class AverageOfThreeNumbers {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Read first number
        System.out.print("Enter first number: ");
        double a = input.nextDouble();

        // Read second number
        System.out.print("Enter second number: ");
        double b = input.nextDouble();

        // Read third number
        System.out.print("Enter third number: ");
        double c = input.nextDouble();

        // Calculate the average of three numbers
        double avg = (a + b + c) / 3;

        // Display the average
        System.out.println("Average = " + avg);

        // Close the Scanner object
        input.close();
    }
}
