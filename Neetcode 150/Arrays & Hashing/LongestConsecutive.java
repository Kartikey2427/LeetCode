// 128 - Longest Consecutive Subsequence

import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        // convert into hashSet for linear time complexity
        Set<Integer> numbers = new HashSet<>();
        for (int num : nums) {
            numbers.add(num);
        }

        int max = 0;
        for (int num : nums) {
            int length = 0;

            // checks the previous element if present then continues and moves forward
            if (numbers.contains(num - 1)) {
                continue;
            } else {
                length = 1;
                // if not present it considers as the first element of the window
                while (numbers.contains(num + length)) { // add the length to it to find consecutives
                    length++; // stores the length of consecutives
                }
                if (length > max) {
                    max = length;
                }

            }

        }
        return max;
    }
}
 