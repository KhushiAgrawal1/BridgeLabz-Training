// Program Name : PrimeChecker
// Description  : Checks whether a number is prime

import java.util.Scanner;

public class PrimeChecker
{
    public static boolean isPrime(int number)
    {
        if (number <= 1) return false;

        for (int i = 2; i <= Math.sqrt(number); i++)
        {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPrime(num))
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");
    }
}
