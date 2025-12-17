// Program to calculate discounted course fee

public class FeeDiscount
{
    public static void main(String args[])
    {
        // Course fee
        double fee = 125000;

        // Discount percentage
        double discountPercent = 10;

        // Calculate discount amount
        double discount = fee * discountPercent / 100;

        // Calculate final fee after discount
        double finalFee = fee - discount;

        // Display result
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
