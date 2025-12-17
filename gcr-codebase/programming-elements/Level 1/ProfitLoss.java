// Program to calculate profit and profit in number and percentage
public class ProfitLoss
{
    public static void main(String args[])
    {
        // Cost price and selling price
        int costPrice = 129;
        int sellingPrice = 191;

        // Calculate profit
        int profit = sellingPrice - costPrice;

        // Calculate profit percentage
        double profitPercent = (double) profit / costPrice * 100;

        // Display output using single print statement
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + 
        "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);
    }
}
