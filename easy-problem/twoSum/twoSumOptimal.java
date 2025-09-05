package twoSum;

// 2. Using HashMap (O(n) Time | O(n) Space)

// Idea: Store elements in a hashmap as we traverse. For each element, check if target - nums[i] exists.

// Time Complexity: O(n) because we traverse once.

// Space Complexity: O(n) for the HashMap.

import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
