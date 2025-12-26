import java.util.HashSet;

public class  LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        // HashSet to store unique characters in current window
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0; // To store the result
        int left = 0;      // Left pointer of sliding window

        // Right pointer moves through the string
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If currentChar already exists in set, remove characters from left
            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add currentChar to set
            set.add(currentChar);

            // Update maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
