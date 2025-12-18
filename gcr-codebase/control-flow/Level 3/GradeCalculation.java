// Program Name : Student Grade Calculation Program
// Description  : This program takes marks of Physics, Chemistry and Maths, calculates percentage, grade and remarks

import java.util.Scanner;

public class GradeCalculation
{
    public static void main(String[] args)
    {
        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Get marks from user
        System.out.println("Enter Physics marks:");
        int physics = input.nextInt();

        System.out.println("Enter Chemistry marks:");
        int chemistry = input.nextInt();

        System.out.println("Enter Maths marks:");
        int maths = input.nextInt();

        // Calculate total and percentage
        int total = physics + chemistry + maths;
        double percentage = (total / 300.0) * 100;

        // Display percentage
        System.out.println("Percentage = " + percentage);

        // Check grade and remarks
        if (percentage >= 80)
        {
            System.out.println("Grade : A");
            System.out.println("Remarks : Level 4, above agency-normalized standards");
        }
        else if (percentage >= 70)
        {
            System.out.println("Grade : B");
            System.out.println("Remarks : Level 3, at agency-normalized standards");
        }
        else if (percentage >= 60)
        {
            System.out.println("Grade : C");
            System.out.println("Remarks : Level 2, below but approaching standards");
        }
        else if (percentage >= 50)
        {
            System.out.println("Grade : D");
            System.out.println("Remarks : Level 1, well below standards");
        }
        else if (percentage >= 40)
        {
            System.out.println("Grade : E");
            System.out.println("Remarks : Too below agency-normalized standards");
        }
        else
        {
            System.out.println("Grade : R");
            System.out.println("Remarks : Remedial standards");
        }
    }
}
