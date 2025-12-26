/*
 Program Name : Coffee Billing System
 Description  : This program takes coffee type and quantity from the user,
                calculates the total bill, adds GST, and continues serving
                customers until the user types "exit".
 Concepts Used: Scanner, variables, switch case, arithmetic operators,
                while loop, break, continue
*/

import java.util.Scanner;

public class CoffeeBillingSystem {
    public static void main(String[] args) {

        // Scanner object for taking user input
        Scanner input = new Scanner(System.in);

        String coffeeType;   // Stores coffee type entered by user

        // While loop to serve multiple customers continuously
        while (true) {

            // Ask user for coffee type
            System.out.println("\nEnter coffee type (Espresso / Latte / Cappuccino) or type 'exit' to stop:");
            coffeeType = input.nextLine();

            // Exit condition
            if (coffeeType.equalsIgnoreCase("exit")) {
                System.out.println("Thank you! Coffee shop closed.");
                break; // Exit the loop
            }

            double price = 0; // Price per cup

            // Switch case to decide price based on coffee type
            switch (coffeeType.toLowerCase()) {
                case "espresso":
                    price = 120;
                    break;
                case "latte":
                    price = 150;
                    break;
                case "cappuccino":
                    price = 180;
                    break;
                default:
                    System.out.println("Invalid coffee type! Please try again.");
                    continue; // Restart loop for new input
            }

            // Ask for quantity
            System.out.print("Enter quantity: ");
            int quantity = input.nextInt();
            input.nextLine(); // Clear input buffer

            // Calculate total cost
            double total = price * quantity;

            // Calculate GST (18%)
            double gst = total * 0.18;

            // Calculate final payable amount
            double finalBill = total + gst;

            // Display bill details
            System.out.println("------ Bill Details ------");
            System.out.println("Coffee Type : " + coffeeType);
            System.out.println("Price       : ₹" + price);
            System.out.println("Quantity    : " + quantity);
            System.out.println("Total       : ₹" + total);
            System.out.println("GST (18%)   : ₹" + gst);
            System.out.println("Final Bill  : ₹" + finalBill);
        }

        
        input.close();
    }
}
