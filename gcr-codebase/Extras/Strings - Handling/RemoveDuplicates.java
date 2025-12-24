/* Program Name: Remove Duplicate Characters
   Description : This program removes duplicate characters from a string
                 using LinkedHashSet.
*/
import java.util.Scanner;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static String removeDuplicates(String str) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char ch : str.toCharArray())
            set.add(ch);

        StringBuilder result = new StringBuilder();
        for (char ch : set)
            result.append(ch);

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(removeDuplicates(input));
    }
}
