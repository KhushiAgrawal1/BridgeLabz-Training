// Program Name : Multiplication Table Program
// Description  : Prints multiplication table using array

import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = input.nextInt();
		
        // 0 1 2 3 4 5 6 7 8 9
        int[] table = new int[10]; 

        for (int i = 1; i <= 10; i++)
        {
            table[i - 1] = number * i;
        }

        for (int i = 1; i <= 10; i++)
        {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }
    }
}
