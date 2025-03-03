// 2161 - Partition Array according to given pivot

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] res = new int[n];
        int idx = 0;

        // for less than pivot
        int i = 0;
        while (i < n) {
            if (nums[i] < pivot) {
                res[idx] = nums[i];
                idx++;
            }
            i++;
        }

        // for equal to pivot
        i = 0;
        while (i < n) {
            if (nums[i] == pivot) {
                res[idx] = nums[i];
                idx++;
            }
            i++;
        }

        // for greater than pivot
        i = 0;
        while (i < n) {
            if (nums[i] > pivot) {
                res[idx] = nums[i];
                idx++;
            }
            i++;
        }
        return res;
    }
}