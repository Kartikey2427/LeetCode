// 125 - Valid Palindrome

class Solution {
    public boolean isPalindrome(String s) {
        // Assign left and right pointers
        int l = 0, r = s.length() - 1;

        while (l < r) {

            // check for non alphanumeric elements left side -> if not present
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                // increment left
                l++;
            }

            // check for non alphanumeric elements right side -> if not present
            while (r > l && !Character.isLetterOrDigit(s.charAt(r))) {
                // decrement left
                r--;
            }

            // compare letter at l and r if not equal return false
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }

            // both pointers will move
            l++;
            r--;
        }
        // after all checks it will return true
        return true;
    }
}