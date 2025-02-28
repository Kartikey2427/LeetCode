// 3 - Longest substring without repeating characters

import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int max = 0;
        // to store unique values
        HashSet<Character> newSet = new HashSet<>();

        // iterate right pointer
        for (int right = 0; right < s.length(); right++) {
            while (newSet.contains(s.charAt(right))) { // if already present shrink from the left
                newSet.remove(s.charAt(left)); // then remove
                left++; // move left to remove duplicates
            }
            newSet.add(s.charAt((right))); // add
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}