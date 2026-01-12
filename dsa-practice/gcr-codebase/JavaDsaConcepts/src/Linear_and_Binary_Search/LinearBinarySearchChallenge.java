package Linear_and_Binary_Search;

import java.util.Arrays;

public class LinearBinarySearchChallenge {

    // -------- Linear Search: First Missing Positive --------
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Place each number in its "correct" position if possible
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                // Swap nums[i] to its correct position
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }

        // Step 2: Find the first index where nums[i] != i + 1
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // All numbers from 1 to n are present
        return n + 1;
    }

    // -------- Binary Search: Find target index --------
    public static int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {

        int[] nums = {3, 4, -1, 1};
        int target = 4;

        // -------- Linear Search for first missing positive --------
        int missing = firstMissingPositive(Arrays.copyOf(nums, nums.length));
        System.out.println("First Missing Positive: " + missing);

        // -------- Binary Search for target index --------
        int[] sortedNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedNums); // Sort array first
        int index = binarySearch(sortedNums, target);
        System.out.println("Target " + target + " Index in sorted array: " + index);
    }
}

