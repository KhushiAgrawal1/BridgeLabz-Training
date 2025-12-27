/*
 Program Name : Raj's Result Generator
 Description  : This program takes marks of 5 subjects, calculates
                average marks, and assigns grade using switch case.
*/

import java.util.Scanner;

public class ResultGenerator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int total = 0;

        // for-loop to input 5 subject marks
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = input.nextInt();
            total += marks;
        }

        // Calculate average
        int average = total / 5;
        System.out.println("Average Marks: " + average);

        // Assign grade using switch
        switch (average / 10) {
            case 10:
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
                System.out.println("Grade: B");
                break;
            case 7:
                System.out.println("Grade: C");
                break;
            case 6:
                System.out.println("Grade: D");
                break;
            default:
                System.out.println("Grade: F");
        }

        input.close();
    }
}
