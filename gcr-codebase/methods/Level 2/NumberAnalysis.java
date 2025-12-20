// Program Name : Number Analysis
// Description  : This program analyzes five numbers for positivity, even/odd status, and compares the first and last numbers.


import java.util.Scanner;

// Program to analyze numbers for positivity, even/odd and comparison
public class NumberAnalysis {

    // Method to check whether number is positive
    public static boolean isPositive(int number) {
        // Zero and positive numbers return true
        return number >= 0;
    }

    // Method to check whether number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    // Returns 1 if number1 > number2
    // Returns 0 if both are equal
    // Returns -1 if number1 < number2
    public static int compareNumbers(int number1, int number2) {

        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Array to store 5 numbers
        int[] numbers = new int[5];

        // Loop to take input and analyze each number
        for (int i = 0; i < numbers.length; i++) {

            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();

            // Check if number is positive
            if (isPositive(numbers[i])) {

                // If positive, check even or odd
                if (isEven(numbers[i])) {
                    System.out.println("Positive Even Number");
                } else {
                    System.out.println("Positive Odd Number");
                }

            } else {
                // If number is negative
                System.out.println("Negative Number");
            }
        }

        // Compare first and last elements of the array
        int comparisonResult = compareNumbers(numbers[0], numbers[numbers.length - 1]);

        // Display comparison result
        if (comparisonResult == 1) {
            System.out.println("First number is greater than last number");
        } else if (comparisonResult == 0) {
            System.out.println("First number is equal to last number");
        } else {
            System.out.println("First number is less than last number");
        }
    }
}
