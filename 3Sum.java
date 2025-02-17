// 15 - 3Sum

// Brute force method
import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        // sort the array and made new list for final result
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);

        // three for loops for indexes
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> newList = Arrays.asList(nums[i], nums[j], nums[k]);
                        result.add(newList);
                    }
                }
            }
        }

        return new ArrayList<>(result);
    }
}