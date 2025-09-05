package palindrome;
/*
 * . Mathematical Approach (Reverse Number)

Negative numbers are not palindromes.

Reverse the number mathematically, compare with original.

Time Complexity: O(log₁₀(n)) (digits count).
Space Complexity: O(1).
 */
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;  // negatives not palindrome
        
        int original = x;
        long reversed = 0;
        
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        
        return original == reversed;
    }
}

