package romanToInteger;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;
        for (int i = 0; i < s.length(); ) {
            int currentValue = map.get(s.charAt(i));
            if (i+1 < s.length()) {
                int nextValue = map.get(s.charAt(i+1));
                if (nextValue > currentValue) {
                    total += nextValue - currentValue;
                    i +=2;
                    continue;
                }
            }
            total += currentValue;
            i +=1;
        }
        return total;
    }
}
