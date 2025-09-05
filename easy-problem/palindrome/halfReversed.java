package palindrome;
/*
 * 3. Optimized Half Reversal

Instead of reversing the entire number, we reverse only half and compare.

Idea:

Keep extracting last digit to build reversed half.

Stop when reversed half ≥ remaining half.

Time Complexity: O(log₁₀(n))
Space Complexity: O(1)
 */

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        int reversedHalf = 0;

        while (x > reversedHalf) {
            int lastDigit = x % 10;
            reversedHalf = reversedHalf * 10 + lastDigit;
            x /= 10;
        }

        return x == reversedHalf || x == reversedHalf / 10;
    }
}
