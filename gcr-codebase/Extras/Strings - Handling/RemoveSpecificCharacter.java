/* Program Name: Remove Specific Character
   Description : This program removes all occurrences of a given
                 character using replace() method.
*/
import java.util.Scanner;

public class RemoveSpecificCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
        System.out.println(str.replace(String.valueOf(ch), ""));
    }
}
