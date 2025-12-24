// Program Name : FactorialRecursion
// Description  : Calculates factorial using recursion

import java.util.Scanner;

public class FactorialRecursion
{
    public static long factorial(int n)
    {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.println("Factorial: " + factorial(num));
    }
}
