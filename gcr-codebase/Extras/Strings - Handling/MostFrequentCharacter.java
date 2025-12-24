/* Program Name: Most Frequent Character
   Description : This program finds the most frequent character
                 in a string using HashMap.
*/
import java.util.Scanner;
import java.util.HashMap;

public class MostFrequentCharacter {
    public static char mostFrequentChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray())
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        char maxChar = str.charAt(0);
        int max = 0;

        for (char ch : map.keySet()) {
            if (map.get(ch) > max) {
                max = map.get(ch);
                maxChar = ch;
            }
        }
        return maxChar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(mostFrequentChar(input));
    }
}
