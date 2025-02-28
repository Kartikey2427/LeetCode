// 242 - Valid Anagram

import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        // for empty string
        if (s.length() != t.length()) {
            return false;
        }

        // changed to character array
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();

        Arrays.sort(S);
        Arrays.sort(T);

        return Arrays.equals(S, T);
    }
}