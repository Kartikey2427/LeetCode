// 167 -  Two Sum when Array is Sorted 

class Solution {
    public int[] twoSum(int[] numbers, int target) {

        // assign left and right pointers
        int first = 0;
        int last = numbers.length - 1;

        while (numbers[first] + numbers[last] != target) {
            if (numbers[first] + numbers[last] < target) {
                first++;
            } else {
                last--;
            }

        }
        // as mentioned it is 1-indexed so add 1 to both
        return new int[] { first + 1, last + 1 };
    }
}