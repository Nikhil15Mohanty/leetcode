package palindrome;
/*
 * 1. Brute Force Approach (Convert to String)

Convert the integer to a string.

Reverse the string and check if it equals the original.

Time Complexity: O(n) (where n = number of digits).
Space Complexity: O(n) (string builder for reverse).
 */

class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
