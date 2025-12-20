// Program Name : Student Marks, Percentage and Grade using 2D Array
// Description  : This program stores marks of Physics, Chemistry and Maths in a 2D array,
//                calculates percentage and grade for each student

import java.util.Scanner;

public class StudentGrade2DArray
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Take input for number of students
        System.out.print("Enter number of students: ");
        int number = input.nextInt();

        // 2D array to store marks
        // index 0 -> Physics, index 1 -> Chemistry, index 2 -> Maths
        double[][] marks = new double[number][3];

        // Arrays to store percentage and grade
        double[] percentage = new double[number];
        String[] grade = new String[number];

        // Taking marks input
        for(int i = 0; i < number; i++)
        {
            System.out.println("\nEnter marks for student " + (i + 1));

            System.out.print("Physics: ");
            marks[i][0] = input.nextDouble();

            System.out.print("Chemistry: ");
            marks[i][1] = input.nextDouble();

            System.out.print("Maths: ");
            marks[i][2] = input.nextDouble();

            // Validate marks
            if(marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0)
            {
                System.out.println("Invalid marks. Enter positive values again.");
                i--;
            }
        }

        // Calculate percentage and grade
        for(int i = 0; i < number; i++)
        {
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3;

            if(percentage[i] >= 80)
            {
                grade[i] = "A (Level 4)";
            }
            else if(percentage[i] >= 70)
            {
                grade[i] = "B (Level 3)";
            }
            else if(percentage[i] >= 60)
            {
                grade[i] = "C (Level 2)";
            }
            else if(percentage[i] >= 50)
            {
                grade[i] = "D (Level 1)";
            }
            else if(percentage[i] >= 40)
            {
                grade[i] = "E (Below Standard)";
            }
            else
            {
                grade[i] = "R (Remedial)";
            }
        }

        // Display result
        System.out.println("\nPhysics\tChemistry\tMaths\tPercentage\tGrade");

        for(int i = 0; i < number; i++)
        {
            System.out.println(
                marks[i][0] + "\t" +
                marks[i][1] + "\t\t" +
                marks[i][2] + "\t" +
                String.format("%.2f", percentage[i]) + "\t\t" +
                grade[i]
            );
        }

        input.close();
    }
}
