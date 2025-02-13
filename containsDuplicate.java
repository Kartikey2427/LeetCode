// Contains duplicate

import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {

        // first sort the array
        Arrays.sort(nums);

        // iterate to check the duplicacy
        for (int i = 0; i < nums.length - 1; i++) {
            // if at any point, value of two consecutive arrays becomes equal return true
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }

        return false;
    }
}