import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int secretNumber = 45; // You can change this number
        int guess;
        int attempts = 0;
        int maxAttempts = 5;

        System.out.println("🎲 Welcome to Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100");
        System.out.println("You have only 5 attempts.\n");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > secretNumber) {
                System.out.println("Too high ❌");
            } else if (guess < secretNumber) {
                System.out.println("Too low ❌");
            } else {
                System.out.println("🎉 Congratulations! You guessed the number in " 
                                   + attempts + " attempts.");
                break;
            }

            if (attempts == maxAttempts) {
                System.out.println("\n❗ Game Over! You've used all attempts.");
                System.out.println("The correct number was: " + secretNumber);
            }

        } while (attempts < maxAttempts);

        sc.close();
    }
}
