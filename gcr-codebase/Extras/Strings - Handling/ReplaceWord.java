/* Program Name: Replace Word in Sentence
   Description : This program replaces a word in a sentence
                 using replace() method.
*/
import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String oldWord = sc.next();
        String newWord = sc.next();
        System.out.println(sentence.replace(oldWord, newWord));
    }
}
