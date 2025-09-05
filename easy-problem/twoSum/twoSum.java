package twoSum;
/*
 * 1. Brute Force Approach (O(n²) Time | O(1) Space)

Idea: Check all possible pairs.

Time Complexity: O(n²) because we use two loops.

Space Complexity: O(1).
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; // return indices
                }
            }
        }
        return new int[]{}; // in case no solution found
    }
}
