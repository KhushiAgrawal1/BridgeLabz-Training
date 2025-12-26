import java.util.Scanner; // Import Scanner class for user input

// Program Name : Youngest and Tallest Friend Finder
// Description  : This program finds the youngest and tallest friend among Amar, Akbar, and Anthony based on user input of age and height.

public class YoungestAndTallestFriend {

    // Method to find the index of the youngest friend based on age array
    public static int findYoungestIndex(int[] ages) {

        int youngestIndex = 0; // Assume first friend is youngest initially

        // Loop through ages to find minimum age
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        return youngestIndex; // Return index of youngest friend
    }

    // Method to find the index of the tallest friend based on height array
    public static int findTallestIndex(double[] heights) {

        int tallestIndex = 0; // Assume first friend is tallest initially

        // Loop through heights to find maximum height
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        return tallestIndex; // Return index of tallest friend
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Scanner object for user input

        String[] friends = {"Amar", "Akbar", "Anthony"}; // Array of friend names
        int[] ages = new int[3];        // Array to store ages
        double[] heights = new double[3]; // Array to store heights

        // Take input for age and height of each friend
        for (int i = 0; i < friends.length; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = input.nextInt();

            System.out.print("Enter height of " + friends[i] + ": ");
            heights[i] = input.nextDouble();
        }

        // Find youngest and tallest friend indices
        int youngestFriendIndex = findYoungestIndex(ages);
        int tallestFriendIndex = findTallestIndex(heights);

        // Display results
        System.out.println("Youngest Friend is " + friends[youngestFriendIndex]);
        System.out.println("Tallest Friend is " + friends[tallestFriendIndex]);

        input.close(); // Close Scanner
    }
}
