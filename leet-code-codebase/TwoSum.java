import java.util.HashMap;

public class TwoSum {

    /*
     Method Name : twoSum
     Description : Finds two indices such that nums[i] + nums[j] = target
     Input       : Integer array nums, integer target
     Output      : Integer array containing two indices
    */
    public int[] twoSum(int[] nums, int target) {

        // HashMap to store number and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Store array elements with their indices in HashMap
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        // Step 2: Check for the required pair
        for (int i = 0; i < nums.length; i++) {

            int currentNumber = nums[i];
            int remainingValue = target - currentNumber;

            // Check if remaining value exists in map
            if (map.containsKey(remainingValue)) {

                int indexFromMap = map.get(remainingValue);

                // Ensure we are not using the same element twice
                if (indexFromMap == i) {
                    continue;
                }

                // Return indices if valid pair is found
                return new int[]{i, indexFromMap};
            }
        }

        // Return empty array if no solution is found
        return new int[]{};
    }
}
