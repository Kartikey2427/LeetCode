// 11 - Container with most water

class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int ht = Math.min(height[left], height[right]);
            int width = right - left;
            int currArea = ht * width;
            maxArea = Math.max(maxArea,currArea);

            if (height[left] < height[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        return maxArea;
    }
}
