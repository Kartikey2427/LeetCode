// 153 - Find minimum in rotated sorted array

class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        // Binary search using lower bound
        while (l < r) {
            // calculating mid
            int m = l + (r - l) / 2;
            if (nums[m] < nums[r]) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return nums[l];
    }
}