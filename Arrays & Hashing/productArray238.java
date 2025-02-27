// 238 - Product of array except itself

class Solution {
    public int[] productExceptSelf(int[] nums) {

        // output array
        int ans[] = new int[nums.length];

        // left side multiplication
        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = prefix;
            prefix *= nums[i];
        }

        // right side multiplication
        int suffix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= suffix;
            suffix *= nums[i];
        }
        return ans;
    }
}
