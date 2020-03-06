package Problem19;

public class Problem19 {
    public static void main(String[] args) {
        System.out.println(new Solution().isMatch("aaaaaaaaaaaaab", "a*a*a*a*a*a*a*a*a*a*c"));
    }
}

class Solution {
    public boolean isMatch(String s, String p) {
        if (p == null || p.length() == 0)
            return s == null || s.length() == 0;
        var b = s.length() != 0 && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.');
        if (p.length() > 1 && p.charAt(1) == '*') {
            return isMatch(s, p.substring(2)) || b && isMatch(s.substring(1), p);
        }
        else
            return b && isMatch(s.substring(1), p.substring(1));
    }
}