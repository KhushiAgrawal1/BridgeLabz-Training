// Program Name : NumberGuessingGame
// Description  : Computer guesses a number between 1 and 100 based on user feedback

import java.util.Scanner;

public class NumberGuessingGame
{
    public static int generateGuess(int low, int high)
    {
        return low + (int)(Math.random() * (high - low + 1));
    }

    public static String getFeedback(Scanner sc)
    {
        System.out.print("Is the guess High, Low, or Correct? ");
        return sc.next();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;

        System.out.println("Think of a number between 1 and 100.");

        while (true)
        {
            int guess = generateGuess(low, high);
            System.out.println("Computer guesses: " + guess);

            String feedback = getFeedback(sc);

            if (feedback.equalsIgnoreCase("Correct"))
            {
                System.out.println("Computer guessed correctly!");
                break;
            }
            else if (feedback.equalsIgnoreCase("High"))
            {
                high = guess - 1;
            }
            else if (feedback.equalsIgnoreCase("Low"))
            {
                low = guess + 1;
            }
        }
    }
}
