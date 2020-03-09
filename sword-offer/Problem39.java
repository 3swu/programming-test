package Problem39;

import java.util.HashMap;
import java.util.Map;

public class Problem39 {
}

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            int temp = map.getOrDefault(n, 0);
            if (temp >= nums.length / 2)
                return n;
            map.put(n, temp + 1);
        }
        return 0;
    }
}