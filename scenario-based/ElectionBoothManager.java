/*
 Program Name : Election Booth Manager
 Description  : This program checks voter eligibility based on age,
                records vote for candidates, and continues for multiple
                voters until a special exit code is entered.
*/

import java.util.Scanner;

public class ElectionBoothManager {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            // Take age input
            System.out.print("Enter age (Enter -1 to exit): ");
            int age = input.nextInt();

            // Exit condition
            if (age == -1) {
                System.out.println("Polling closed.");
                break;
            }

            // Check eligibility
            if (age >= 18) {
                System.out.println("You are eligible to vote.");
                System.out.print("Vote for candidate (1 / 2 / 3): ");
                int vote = input.nextInt();
                System.out.println("Vote recorded successfully.");
            } else {
                System.out.println("Not eligible to vote.");
            }
        }

        input.close();
    }
}
