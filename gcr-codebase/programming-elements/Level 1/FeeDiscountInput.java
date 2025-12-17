import java.util.Scanner;

// Program to calculate discounted fee using user input

public class FeeDiscountInput
{
    public static void main(String args[])
    {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Read fee and discount percentage
        double fee = input.nextDouble();
        double discountPercent = input.nextDouble();

        // Calculate discount amount
        double discount = fee * discountPercent / 100;

        // Calculate final fee
        double finalFee = fee - discount;

        // Display result
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee)        
    }
}
