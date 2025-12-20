// Program Name : Handshakes Program
// Description  : Calculates total number of handshakes among students

import java.util.Scanner;

public class Handshakes
{
    // Method to calculate total handshakes
    public static int calculateHandshakes(int numberOfStudents)
    {
        // Formula: n * (n - 1) / 2
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args)
    {
        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take number of students
        System.out.println("Enter number of students: ");
        int numberOfStudents = input.nextInt(); 
    
        // Call method to calculate handshakes
        int total = calculateHandshakes(numberOfStudents);

        // Display total handshakes
        System.out.println("Total handshakes: " + total);
    }
}
