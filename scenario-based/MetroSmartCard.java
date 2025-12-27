/*
 Program Name : Metro Smart Card Fare Deduction
 Description  : This program calculates metro fare based on distance
                using ternary operator and deducts it from card balance
                until balance is exhausted or user exits.
*/

import java.util.Scanner;

public class MetroSmartCard {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double balance = 200; // Initial smart card balance

        while (balance > 0) {
            System.out.print("Enter distance in km (0 to exit): ");
            int distance = input.nextInt();

            // Exit condition
            if (distance == 0) {
                System.out.println("Thank you for using Delhi Metro.");
                break;
            }

            // Fare calculation using ternary operator
            double fare = (distance <= 5) ? 20 : (distance <= 15) ? 40 : 60;

            // Check sufficient balance
            if (fare <= balance) {
                balance -= fare;
                System.out.println("Fare deducted: ₹" + fare);
                System.out.println("Remaining balance: ₹" + balance);
            } else {
                System.out.println("Insufficient balance.");
                break;
            }
        }

        input.close();
    }
}
