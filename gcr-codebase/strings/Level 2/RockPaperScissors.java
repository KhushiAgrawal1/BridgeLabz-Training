// Program Name : Rock Paper Scissors Game
// Description  : This program simulates the Rock-Paper-Scissors game
//                between a user and the computer for multiple games.
//                It displays the result of each game and calculates
//                the win count, average, and winning percentage.

import java.util.Scanner;

public class RockPaperScissors
{
    // Method to generate computer choice using Math.random()
    public static String getComputerChoice()
    {
        int choice = (int)(Math.random() * 3);

        if (choice == 0)
            return "Rock";
        else if (choice == 1)
            return "Paper";
        else
            return "Scissors";
    }

    // Method to find winner between user and computer
    // Returns "User", "Computer", or "Draw"
    public static String findWinner(String user, String computer)
    {
        if (user.equalsIgnoreCase(computer))
            return "Draw";

        if ((user.equalsIgnoreCase("Rock") && computer.equals("Scissors")) ||
            (user.equalsIgnoreCase("Paper") && computer.equals("Rock")) ||
            (user.equalsIgnoreCase("Scissors") && computer.equals("Paper")))
        {
            return "User";
        }
        else
        {
            return "Computer";
        }
    }

    // Method to calculate win count, average, and percentage
    // Returns 2D String array
    public static String[][] calculateStats(int userWins, int compWins, int totalGames)
    {
        String[][] stats = new String[2][3];

        double userPercent = (userWins * 100.0) / totalGames;
        double compPercent = (compWins * 100.0) / totalGames;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f%%", userPercent);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.format("%.2f%%", compPercent);

        return stats;
    }

    // Method to display game results and final statistics
    public static void displayResults(String[][] gameResults, String[][] stats)
    {
        System.out.println("\nGame\tUser\t\tComputer\tWinner");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < gameResults.length; i++)
        {
            System.out.println((i + 1) + "\t" +
                               gameResults[i][0] + "\t\t" +
                               gameResults[i][1] + "\t\t" +
                               gameResults[i][2]);
        }

        System.out.println("\nPlayer\tWins\tWinning %");
        System.out.println("---------------------------");

        for (int i = 0; i < stats.length; i++)
        {
            System.out.println(stats[i][0] + "\t" +
                               stats[i][1] + "\t" +
                               stats[i][2]);
        }
    }

    // Main method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of games:");
        int games = input.nextInt();

        String[][] gameResults = new String[games][3];

        int userWins = 0;
        int compWins = 0;

        for (int i = 0; i < games; i++)
        {
            System.out.println("\nGame " + (i + 1));
            System.out.print("Enter your choice (Rock / Paper / Scissors): ");
            String userChoice = input.next();

            String compChoice = getComputerChoice();
            String winner = findWinner(userChoice, compChoice);

            if (winner.equals("User"))
                userWins++;
            else if (winner.equals("Computer"))
                compWins++;

            gameResults[i][0] = userChoice;
            gameResults[i][1] = compChoice;
            gameResults[i][2] = winner;
        }

        String[][] stats = calculateStats(userWins, compWins, games);
        displayResults(gameResults, stats);
    }
}
