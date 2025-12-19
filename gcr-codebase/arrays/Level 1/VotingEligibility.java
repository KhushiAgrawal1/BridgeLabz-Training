// Program Name : Voting Eligibility Program
// Description  : This program checks voting eligibility of 10 students

import java.util.Scanner;

public class VotingEligibility
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int[] ages = new int[10];

        // Take input for ages
        for (int i = 0; i < ages.length; i++)
        {
            System.out.println("Enter age of student " + (i + 1));
            ages[i] = input.nextInt();
        }

        // Check voting eligibility
        for (int i = 0; i < ages.length; i++)
        {
            if (ages[i] < 0)
            {
                System.out.println("Invalid age");
            }
            else if (ages[i] >= 18)
            {
                System.out.println("The student with the age " + ages[i] + " can vote");
            }
            else
            {
                System.out.println("The student with the age " + ages[i] + " cannot vote");
            }
        }
    }
}
