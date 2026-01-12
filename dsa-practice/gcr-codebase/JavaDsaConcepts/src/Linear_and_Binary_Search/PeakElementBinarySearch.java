package Linear_and_Binary_Search;

public class PeakElementBinarySearch {

    // Method to find index of a peak element
    public static int findPeakElement(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check left and right neighbors safely
            boolean isLeftSmaller = (mid == 0) || (arr[mid] > arr[mid - 1]);
            boolean isRightSmaller = (mid == arr.length - 1) || (arr[mid] > arr[mid + 1]);

            // If both conditions satisfied, it's a peak
            if (isLeftSmaller && isRightSmaller) {
                return mid;
            }

            // If left neighbor is greater, peak is on left side
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            } 
            // Else peak is on right side
            else {
                left = mid + 1;
            }
        }

        return -1; // Should never reach here for valid input
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 20, 4, 1, 0};

        int peakIndex = findPeakElement(arr);

        System.out.println("Peak Element Index: " + peakIndex);
        System.out.println("Peak Element Value: " + arr[peakIndex]);
    }
}

