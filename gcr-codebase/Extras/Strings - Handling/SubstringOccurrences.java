/* Program Name: Substring Occurrences
   Description : This program counts the number of times a substring
                 occurs in a string using indexOf().
*/
import java.util.Scanner;

public class SubstringOccurrences {
    public static int countOccurrences(String str, String sub) {          
        int count = 0, index = 0;

        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String sub = sc.nextLine();
        System.out.println(countOccurrences(str, sub));
    }
}
