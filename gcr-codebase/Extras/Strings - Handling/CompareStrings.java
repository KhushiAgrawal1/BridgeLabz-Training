/* Program Name: Compare Two Strings
   Description : This program compares two strings lexicographically
                 using compareTo() method.
*/
import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int result = s1.compareTo(s2);
        if (result < 0)
            System.out.println("First string comes before second");
        else if (result > 0)
            System.out.println("First string comes after second");
        else
            System.out.println("Strings are equal");
    }
}
