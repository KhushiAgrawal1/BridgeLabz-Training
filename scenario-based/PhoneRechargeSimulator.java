import java.util.Scanner;

public class PhoneRechargeSimulator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 0;
        char choice;

        do {
            System.out.print("Enter mobile operator (Jio/Airtel/Vi): ");
            String operator = sc.next();

            System.out.print("Enter recharge amount: ₹");
            double amount = sc.nextDouble();

            balance += amount;

            // Switch for offers
            switch (operator.toLowerCase()) {
                case "jio":
                    System.out.println("Offer: Extra 1GB Data 🎁");
                    break;

                case "airtel":
                    System.out.println("Offer: 100 SMS Free 🎁");
                    break;

                case "vi":
                    System.out.println("Offer: Unlimited Calls for 1 Day 🎁");
                    break;

                default:
                    System.out.println("No offer available ❌");
            }

            System.out.println("Current Balance: ₹" + balance);

            System.out.print("\nDo you want to recharge again? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("\nThank you for using Recharge Simulator 📱");
        sc.close();
    }
}
