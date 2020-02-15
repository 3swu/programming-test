package String3;

import java.util.HashMap;
import java.util.Map;

public class String3 {
    public static void main(String[] args) {
        System.out.println(new Solution().checkInclusion("ab", "eidbaooo"));
    }
}

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            map1.put(s1.charAt(i), map1.containsKey(s1.charAt(i)) ? map1.get(s1.charAt(i)) + 1 : 1);
        }
        if (map1.equals(map2))
            return true;

        for (int i = 0, j = s1.length() - 1; j < s2.length(); i++, j++) {
            if (i == 0) {
                for (char c : s2.substring(0, s1.length()).toCharArray()) {
                    map2.put(c, map2.containsKey(c) ? map2.get(c) + 1 : 1);
                }
            }
            else {
                map2.put(s2.charAt(i - 1), map2.get(s2.charAt(i - 1)) - 1);
                if (map2.get(s2.charAt(i - 1)) == 0)
                    map2.remove(s2.charAt(i - 1));
                map2.put(s2.charAt(j), map2.containsKey(s2.charAt(j)) ? map2.get(s2.charAt(j)) + 1 : 1);
            }
            if (map1.equals(map2))
                return true;
        }
        return map1.equals(map2) ? true : false;
    }
}