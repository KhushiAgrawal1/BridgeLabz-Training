// Program Name : Voting Eligibility Checker
// Description  : This program generates random 2-digit ages for students,
//                checks whether each student is eligible to vote (age >= 18),
//                and displays the result in a tabular format.

import java.util.Scanner;

public class VotingEligibility
{
    // Method to generate random 2-digit ages for n students
    public static int[] generateAges(int numberOfStudents)
    {
        int[] ages = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++)
        {
            // Generates random 2-digit age (10 to 99)
            ages[i] = (int)(Math.random() * 90) + 10;
        }

        return ages;
    }

    // Method to check voting eligibility
    // Returns 2D String array containing age and eligibility (true/false)
    public static String[][] checkVotingEligibility(int[] ages)
    {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++)
        {
            result[i][0] = String.valueOf(ages[i]);

            // Validate negative age
            if (ages[i] < 0)
            {
                result[i][1] = "false";
            }
            else if (ages[i] >= 18)
            {
                result[i][1] = "true";
            }
            else
            {
                result[i][1] = "false";
            }
        }

        return result;
    }

    // Method to display result in tabular format
    public static void displayResult(String[][] data)
    {
        System.out.println("\nStudent\tAge\tCan Vote");
        System.out.println("---------------------------");

        for (int i = 0; i < data.length; i++)
        {
            System.out.println((i + 1) + "\t" + data[i][0] + "\t" + data[i][1]);
        }
    }

    // Main method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // User input for number of students
        System.out.println("Enter number of students:");
        int numberOfStudents = input.nextInt();

        // Method calls
        int[] ages = generateAges(numberOfStudents);
        String[][] eligibility = checkVotingEligibility(ages);
        displayResult(eligibility);
    }
}
