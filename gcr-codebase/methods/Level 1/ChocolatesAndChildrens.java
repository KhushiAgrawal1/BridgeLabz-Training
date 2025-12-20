// Program Name : Chocolates and Children Program
// Description  : Distributes chocolates equally among children and finds remaining chocolates

import java.util.Scanner;

public class ChocolatesAndChildrens
{
    // Method to calculate equal and remaining chocolates
    public static int[] findChocolatesAndChildrens(int chocolates, int childrens)
    {
        // Chocolates each child gets
        int equalChocolates = chocolates / childrens;

        // Remaining chocolates
		int remainingChocolates = chocolates % childrens;
	   
        // Return result as array
        return new int[]{equalChocolates, remainingChocolates};
    }

    public static void main(String[] args)
    {
        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take chocolates input
        System.out.print("Enter chocolates: ");
        int chocolates = input.nextInt();

        // Take number of children input
        System.out.print("Enter childrens: ");
        int childrens = input.nextInt();

        // Call method to calculate result
        int[] result = findChocolatesAndChildrens(chocolates, childrens);

        // Display output
        System.out.println("Equal Chocolates: " + result[0]);
        System.out.println("Remaining Chocolates: " + result[1]);
    }
}
