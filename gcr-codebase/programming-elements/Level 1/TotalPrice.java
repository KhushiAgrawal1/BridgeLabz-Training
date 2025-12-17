import java.util.Scanner;

// Program to calculate total purchase price
public class TotalPrice
{
    public static void main(String args[])
    {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Read unit price and quantity
        double unitPrice = input.nextDouble();
        int quantity = input.nextInt();

        // Calculate total price
        double totalPrice = unitPrice * quantity;

        // Display result
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice );      
    }
}
