// 2481 - Minimum cuts to divide a circle

class Solution {
    public int numberOfCuts(int n) {

        // exactly if one slice needed
        if (n == 1) {
            return 0;
        }

        // if even equal slices needed
        if (n % 2 == 0) {
            return n / 2;

            // odd case
        } else {
            return n;
        }
    }
}