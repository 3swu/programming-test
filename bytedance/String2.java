package String2;

public class String2 {
    public static void main(String[] args) {
        System.out.println(new Solution().longestCommonPrefix(new String[]{}));
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min_len = 99999, cur_len = 0;
        if (strs.length == 0)
            return "";
        else if (strs.length == 1)
            return strs[0];
        for (int i = 1; i < strs.length; i++) {
            for (int j = 0; j < strs[i].length() && j < strs[i - 1].length(); j++) {
                if (strs[i].charAt(j) != strs[i - 1].charAt(j))
                    break;
                cur_len++;
            }
            min_len = Math.min(cur_len, min_len);
            cur_len = 0;
        }
        return strs[0].substring(0, min_len);
    }
}
