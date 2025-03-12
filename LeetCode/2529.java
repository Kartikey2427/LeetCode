// 2529 - Maximum count of positive ineteger and negative integer 

class Solution {
    public int maximumCount(int[] nums) {
        
        // assign two variables 
        int count1 = 0;
        int count2 = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                count1++;
            }
            if(nums[i] < 0){
                count2++;
            }
        }
        return Math.max(count1,count2);
    }
}