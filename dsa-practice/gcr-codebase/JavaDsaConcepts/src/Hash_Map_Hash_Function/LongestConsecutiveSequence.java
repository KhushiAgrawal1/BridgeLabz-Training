package Hash_Map_Hash_Function;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static int longestSequence(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int maxLength = 0;

        for (int num : arr) {
            set.add(num);
        }

        for (int num : arr) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int count = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }
                maxLength = Math.max(maxLength, count);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest Sequence Length: " + longestSequence(arr));
    }
}

