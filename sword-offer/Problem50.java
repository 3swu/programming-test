package Problem50;

import java.util.LinkedHashMap;
import java.util.Map;

public class Problem50 {
}

class Solution {
    public char firstUniqChar(String s) {
        Map<Character, Integer> flagMap = new LinkedHashMap<>();
        for (var c : s.toCharArray())
            flagMap.put(c, flagMap.getOrDefault(c, 0) + 1);
        for (var entry : flagMap.entrySet())
            if (entry.getValue() == 1) return entry.getKey();
        return ' ';
    }
}