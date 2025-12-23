// Program Name : DeckOfCards
// Description  : This program creates a deck of cards, shuffles it,
//                distributes n cards to x players, and displays the cards.

import java.util.Scanner;

public class DeckOfCards
{
    // Method to initialize the deck of cards
    public static String[] initializeDeck(String[] suits, String[] ranks)
    {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;
        for (int i = 0; i < suits.length; i++)
        {
            for (int j = 0; j < ranks.length; j++)
            {
                deck[index++] = ranks[j] + " of " + suits[i];
            }
        }
        return deck;
    }

    // Method to shuffle the deck of cards
    public static String[] shuffleDeck(String[] deck)
    {
        int n = deck.length;

        for (int i = 0; i < n; i++)
        {
            int randomCardNumber = i + (int)(Math.random() * (n - i));

            // Swap cards
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    // Method to distribute cards to players
    public static String[][] distributeCards(String[] deck, int numberOfCards, int numberOfPlayers)
    {
        // Check if cards can be evenly distributed
        if (numberOfCards % numberOfPlayers != 0)
        {
            return null;
        }

        int cardsPerPlayer = numberOfCards / numberOfPlayers;
        String[][] players = new String[numberOfPlayers][cardsPerPlayer];

        int cardIndex = 0;
        for (int i = 0; i < numberOfPlayers; i++)
        {
            for (int j = 0; j < cardsPerPlayer; j++)
            {
                players[i][j] = deck[cardIndex++];
            }
        }
        return players;
    }

    // Method to print players and their cards
    public static void printPlayers(String[][] players)
    {
        for (int i = 0; i < players.length; i++)
        {
            System.out.println("\nPlayer " + (i + 1) + " cards:");
            for (int j = 0; j < players[i].length; j++)
            {
                System.out.println(players[i][j]);
            }
        }
    }

    // Main method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Define suits and ranks
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"
        };

        // Initialize and shuffle deck
        String[] deck = initializeDeck(suits, ranks);
        deck = shuffleDeck(deck);

        // User input
        System.out.print("Enter number of players: ");
        int players = input.nextInt();

        System.out.print("Enter number of cards to distribute: ");
        int cards = input.nextInt();

        // Distribute cards
        String[][] playerCards = distributeCards(deck, cards, players);

        if (playerCards == null)
        {
            System.out.println("Cards cannot be evenly distributed among players.");
        }
        else
        {
            printPlayers(playerCards);
        }
    }
}
