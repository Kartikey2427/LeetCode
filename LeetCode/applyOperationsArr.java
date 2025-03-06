// 2460 - Apply operations to an array 

class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;
            }
        }

        // track the position of zeroes
        int j = 0;

        for (int i = 0; i < n; i++) {

            // moves all the non zero elements to the left and zeroes to right
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

        return nums;
    }
}