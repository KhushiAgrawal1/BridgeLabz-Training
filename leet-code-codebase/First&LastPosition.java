public class First&LastPosition{
    public int[] searchRange(int[] nums, int target) {
        // Find first and last positions using helper methods
        int start = findFirstPosition(nums, target);
        int end = findLastPosition(nums, target);
        return new int[]{start, end};
    }

    // Helper method to find the first occurrence of target
    private int findFirstPosition(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                result = mid;      // possible answer
                right = mid - 1;   // continue search on left side
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    // Helper method to find the last occurrence of target
    private int findLastPosition(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                result = mid;      // possible answer
                left = mid + 1;    // continue search on right side
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}
