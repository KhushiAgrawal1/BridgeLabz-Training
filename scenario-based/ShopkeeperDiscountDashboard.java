import java.util.Scanner;

public class ShopkeeperDiscountDashboard {

    // Constants
    static final double DISCOUNT_20 = 0.20;
    static final double DISCOUNT_10 = 0.10;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        double totalBill = 0;

        // Input item prices using for-loop
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter price of item " + i + ": ");
            totalBill += sc.nextDouble();
        }

        double discount = 0;

        // Discount logic using if-else
        if (totalBill >= 5000) {
            discount = totalBill * DISCOUNT_20;
        } else if (totalBill >= 3000) {
            discount = totalBill * DISCOUNT_10;
        }

        double finalAmount = totalBill - discount;

        // Output
        System.out.println("\nTotal Bill: ₹" + totalBill);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Amount to Pay: ₹" + finalAmount);

        sc.close();
    }
}
