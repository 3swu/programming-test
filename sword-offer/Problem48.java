package Problem48;

import java.util.HashMap;
import java.util.Map;

public class Problem48 {
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> flagMap = new HashMap<>();
        int max = 0;
        int[] dp = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) dp[i] = 1;
            else {
                if (i - flagMap.getOrDefault(s.charAt(i), -1) > dp[i - 1]) dp[i] = dp[i - 1] + 1;
                else dp[i] = i - flagMap.get(s.charAt(i));
            }
            max = Math.max(max, dp[i]);
            flagMap.put(s.charAt(i), i);
        }
        return max;
    }
}