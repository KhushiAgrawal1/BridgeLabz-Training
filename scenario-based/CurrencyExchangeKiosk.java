import java.util.Scanner;

public class CurrencyExchangeKiosk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter amount in INR: ");
            double inr = sc.nextDouble();

            System.out.println("Choose target currency:");
            System.out.println("1. USD");
            System.out.println("2. EUR");
            System.out.println("3. GBP");

            int currency = sc.nextInt();
            double result = 0;

            switch (currency) {
                case 1:
                    result = inr * 0.012; // INR to USD
                    System.out.println("Amount in USD: " + result);
                    break;
                case 2:
                    result = inr * 0.011; // INR to EUR
                    System.out.println("Amount in EUR: " + result);
                    break;
                case 3:
                    result = inr * 0.0095; // INR to GBP
                    System.out.println("Amount in GBP: " + result);
                    break;
                default:
                    System.out.println("Invalid currency choice!");
            }

            System.out.print("Do you want another conversion? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        sc.close();
    }
}
