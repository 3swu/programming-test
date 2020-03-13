package Problem58_I;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem58_I {
    public static void main(String[] args) {
        System.out.println(new Solution().reverseWords("  hello world!  "));
    }
}

class Solution {
    public String reverseWords(String s) {
        if (s.strip().length() == 0) return "";
        int left = 0, right = 0;
        List<String> list = new ArrayList<>();
        while (left < s.length() && right < s.length()) {
            for (; left < s.length() && s.charAt(left) == ' '; left++);
            if (left >= s.length()) break;
            for (right = left; right < s.length() && s.charAt(right) != ' '; right++);
            list.add(s.substring(left, right));
            left = right;
        }
        Collections.reverse(list);
        var sb = new StringBuilder();
        for (var str : list)
            sb.append(str).append(' ');
        return sb.toString().substring(0, sb.length() - 1);
    }
}