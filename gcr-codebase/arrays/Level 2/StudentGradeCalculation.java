// Program Name : Student Grade Calculation Program
// Description  : Calculates percentage and grade of students based on marks
//                in Physics, Chemistry, and Maths

import java.util.Scanner; // Import Scanner class for user input

public class StudentGradeCalculation
{
    public static void main (String[] args)
    {
        // Create Scanner object to read input
        Scanner input = new Scanner(System.in);
        
        // Ask user for number of students
        System.out.println("Enter number of students: ");
        int students = input.nextInt();
        
        // Arrays to store marks, percentage, and grade
        double[] physicsMarks = new double[students];
        double[] chemistryMarks = new double[students];
        double[] mathsMarks = new double[students];
        double[] percentage = new double[students];
        char[] grade = new char[students];
        
        // Input marks for each student
        for (int i = 0; i < students; i++)
        {				
            System.out.println("Enter physics marks of student " + (i + 1) + ":");		
            physicsMarks[i] = input.nextDouble();
                        
            System.out.println("Enter chemistry marks of student " + (i + 1) + ":");	
            chemistryMarks[i] = input.nextDouble();
            
            System.out.println("Enter maths marks of student " + (i + 1) + ":");			
            mathsMarks[i] = input.nextDouble();
        
            // Validate marks (must be non-negative)
            if (physicsMarks[i] < 0 || chemistryMarks[i] < 0 || mathsMarks[i] < 0)
            {
                System.out.println("Enter positive values only");
                i--; // Repeat input for the same student
            }
        }
        
        // Calculate percentage and assign grade
        for (int i = 0; i < students; i++)
        {
            percentage[i] = (physicsMarks[i] + chemistryMarks[i] + mathsMarks[i]) / 3;
            
            if (percentage[i] >= 80)
                grade[i] = 'A';
            else if (percentage[i] >= 70)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else if (percentage[i] >= 50)
                grade[i] = 'D';
            else if (percentage[i] >= 40)
                grade[i] = 'E';
            else
                grade[i] = 'R';
        }
        
        // Display student details
        for (int i = 0; i < students; i++)
        {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics Marks   : " + physicsMarks[i]);
            System.out.println("Chemistry Marks : " + chemistryMarks[i]);
            System.out.println("Maths Marks     : " + mathsMarks[i]);
            System.out.println("Percentage      : " + percentage[i]);
            System.out.println("Grade           : " + grade[i]);
            System.out.println("-----------------------");
        }	
    }
}
