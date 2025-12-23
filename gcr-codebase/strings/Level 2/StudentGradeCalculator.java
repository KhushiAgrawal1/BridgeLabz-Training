// Program Name : Student Grade Calculator
// Description  : This program generates random marks for Physics, Chemistry,
//                and Maths for students, calculates total, average, percentage,
//                assigns grades based on percentage, and displays the scorecard.

import java.util.Scanner;

public class StudentGradeCalculator
{
    // a. Method to generate random 2-digit PCM scores for students
    public static int[][] generateScores(int numberOfStudents)
    {
        int[][] scores = new int[numberOfStudents][3];

        for (int i = 0; i < numberOfStudents; i++)
        {
            scores[i][0] = (int)(Math.random() * 90) + 10; // Physics
            scores[i][1] = (int)(Math.random() * 90) + 10; // Chemistry
            scores[i][2] = (int)(Math.random() * 90) + 10; // Maths
        }

        return scores;
    }

    // b. Method to calculate total, average and percentage
    public static double[][] calculateResults(int[][] scores)
    {
        double[][] results = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++)
        {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round off to 2 decimal places
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }

        return results;
    }

    // c. Method to calculate grade based on percentage
    public static String[] calculateGrades(double[][] results)
    {
        String[] grades = new String[results.length];

        for (int i = 0; i < results.length; i++)
        {
            double percentage = results[i][2];

            if (percentage >= 80)
                grades[i] = "A";
            else if (percentage >= 70)
                grades[i] = "B";
            else if (percentage >= 60)
                grades[i] = "C";
            else if (percentage >= 50)
                grades[i] = "D";
            else if (percentage >= 40)
                grades[i] = "E";
            else
                grades[i] = "R";
        }

        return grades;
    }

    // d. Method to display scorecard in tabular format
    public static void displayScorecard(int[][] scores, double[][] results, String[] grades)
    {
        System.out.println("\nStudent\tPhy\tChem\tMath\tTotal\tAverage\t%\tGrade");
        System.out.println("---------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++)
        {
            System.out.println((i + 1) + "\t" +
                               scores[i][0] + "\t" +
                               scores[i][1] + "\t" +
                               scores[i][2] + "\t" +
                               (int)results[i][0] + "\t" +
                               results[i][1] + "\t" +
                               results[i][2] + "\t" +
                               grades[i]);
        }
    }

    // Main method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        int[][] scores = generateScores(numberOfStudents);
        double[][] results = calculateResults(scores);
        String[] grades = calculateGrades(results);

        displayScorecard(scores, results, grades);
    }
}
