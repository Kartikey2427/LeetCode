// 3151 - Special Array 1

class Solution {
    public boolean isArraySpecial(int[] nums) {

        // iterate through the array
        for (int i = 0; i < nums.length - 1; i++) {

            // check if the adjacent elements are even/odd returns false
            if ((nums[i] % 2) == (nums[i + 1] % 2)) {
                return false;
            }
        }
        return true; // else return true
    }
}