package Linear_and_Binary_Search;

public class FirstNegativeSearch {

    // Method to find index of first negative number
    public static int findFirstNegative(int[] arr) {

        // Traverse array from start
        for (int i = 0; i < arr.length; i++) {

            // Check if element is negative
            if (arr[i] < 0) {
                return i; // Return index
            }
        }

        // No negative number found
        return -1;
    }

    public static void main(String[] args) {

        int[] numbers = {5, 10, 3, -7, 8, -2};

        int index = findFirstNegative(numbers);

        if (index != -1) {
            System.out.println("First negative number found at index: " + index);
        } else {
            System.out.println("No negative number found in the array.");
        }
    }
}

