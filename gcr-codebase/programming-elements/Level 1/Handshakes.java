import java.util.Scanner;

// Program to find maximum number of handshakes

public class Handshakes
{
    public static void main(String args[])
    {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Read number of students
        int numberOfStudents = input.nextInt();

        // Calculate maximum handshakes using formula
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display result
        System.out.println("The maximum number of possible handshakes is " + handshakes);
    }
}
