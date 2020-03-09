package Problem38;

import java.util.*;

public class Problem38 {
}

class Solution {
    Set<String> set = new HashSet<>();
    public String[] permutation(String s) {
        List<Character> list = new ArrayList<>();
        for (char c : s.toCharArray())
            list.add(c);
        work("", list);
        String[] result = new String[set.size()];
        int i = 0;
        for (String t : set)
            result[i++] = t;
        return result;
    }

    private void work(String pre, List<Character> s) {
        if (s.size() == 0)
            set.add(pre);
        else {
            char temp;
            for (int i = 0; i < s.size(); i++) {
                temp = s.get(i);
                s.remove(i);
                work(pre + temp, s);
                s.add(i, temp);
            }
        }
    }
}