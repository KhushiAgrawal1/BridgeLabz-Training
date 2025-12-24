// Program Name : PalindromeChecker
// Description  : Checks if a string is a palindrome

import java.util.Scanner;

public class PalindromeChecker
{
    public static boolean isPalindrome(String text)
    {
        int start = 0;
        int end = text.length() - 1;

        while (start < end)
        {
            if (text.charAt(start) != text.charAt(end))
                return false;

            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        if (isPalindrome(text))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
