// Program Name : MaximumOfThree
// Description  : Finds the maximum of three numbers using a function

import java.util.Scanner;

public class MaximumOfThree
{
    public static int findMax(int a, int b, int c)
    {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Maximum number: " + findMax(a, b, c));
    }
}
