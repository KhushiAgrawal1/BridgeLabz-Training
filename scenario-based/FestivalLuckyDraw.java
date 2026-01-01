import java.util.Scanner;

public class FestivalLuckyDraw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) { // multiple visitors
            System.out.print("Visitor " + i + " - Enter your lucky number: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Skipping visitor.");
                sc.next(); // clear invalid input
                continue;
            }

            int number = sc.nextInt();

            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("Congratulations! You won a gift 🎁");
            } else {
                System.out.println("Sorry, better luck next time!");
            }
        }

        sc.close();
    }
}
