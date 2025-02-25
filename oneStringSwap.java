// 1790 - Check if one string swap can make strings make equal

import java.util.*;
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int count = 0;

        // for storing and ignore duplicate values
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for (int i = 0; i < s1.length(); i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            if (ch1 != ch2) {
                count++;
                set1.add(ch1);
                set2.add(ch2);
            }

            // more than one swap needed
            if (count > 2) {
                return false;
            }
        }

        return (count == 2 && set1.equals(set2)) || (count == 0);

    }
}