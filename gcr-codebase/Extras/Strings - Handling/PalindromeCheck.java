/* Program Name: Palindrome String Check
   Description : This program checks whether a string is a palindrome
                 using built-in string functions.
*/
import java.util.Scanner;

public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(isPalindrome(input) ? "Palindrome" : "Not Palindrome");
    }
}
