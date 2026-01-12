package Linear_and_Binary_Search;

public class RotationPointBinarySearch {

    // Method to find index of smallest element (rotation point)
    public static int findRotationPoint(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        // Binary search
        while (left < right) {
            int mid = left + (right - left) / 2;

            // Compare mid with right
            if (arr[mid] > arr[right]) {
                // Minimum is in right half
                left = mid + 1;
            } else {
                // Minimum is in left half (including mid)
                right = mid;
            }
        }

        // left == right → index of smallest element
        return left;
    }

    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7, 0, 1, 2};

        int rotationIndex = findRotationPoint(arr);

        System.out.println("Rotation Point Index: " + rotationIndex);
        System.out.println("Smallest Element    : " + arr[rotationIndex]);
    }
}

