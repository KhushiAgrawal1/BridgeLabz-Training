// Program Name : Student Voting Eligibility Checker
// Description  : This program checks whether students are eligible to vote based on their age.

import java.util.Scanner; // Import Scanner class for user input

public class StudentVoteChecker {

    // Method to check if a student is eligible to vote
    public boolean canStudentVote(int age) {

        if (age < 0) {
            return false; // Negative ages are invalid
        }

        if (age >= 18) {
            return true; // Age 18 or above is eligible to vote
        }

        return false; // Age below 18 is not eligible
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Scanner object named 'input'
        StudentVoteChecker voteChecker = new StudentVoteChecker(); // Create object to call method

        int[] studentAges = new int[10]; // Array to store ages of 10 students

        // Loop to input ages and check voting eligibility
        for (int i = 0; i < studentAges.length; i++) {

            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = input.nextInt(); // Read age input using 'input'

            boolean canVote = voteChecker.canStudentVote(studentAges[i]); // Check eligibility

            // Display result
            if (canVote) {
                System.out.println("Student can vote");
            } else {
                System.out.println("Student cannot vote");
            }
        }

        input.close(); // Close Scanner to free resources
    }
}
