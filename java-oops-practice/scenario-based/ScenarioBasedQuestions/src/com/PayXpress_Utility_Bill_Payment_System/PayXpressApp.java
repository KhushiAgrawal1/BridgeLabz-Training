package PayXpress_Utility_Bill_Payment_System;

import java.util.Scanner;

public class PayXpressApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Bill Type:");
        System.out.println("1. Electricity");
        System.out.println("2. Internet");
        System.out.println("3. Water");
        int choice = sc.nextInt();

        System.out.print("Enter bill amount: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter due date: ");
        String dueDate = sc.nextLine();

        Bill bill;

        if (choice == 1) {
            bill = new ElectricityBill(amount, dueDate);
        } else if (choice == 2) {
            bill = new InternetBill(amount, dueDate);
        } else {
            bill = new WaterBill(amount, dueDate);
        }

        bill.sendReminder();

        System.out.print("Enter late fee penalty: ");
        double penalty = sc.nextDouble();

        System.out.println("Total with late fee: ₹" + bill.calculateLateFee(penalty));

        bill.pay();

        sc.close();
    }
}

