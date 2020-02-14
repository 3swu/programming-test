import java.util.HashSet;
import java.util.Set;

public class String1 {
    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLongestSubstring("wulei"));
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max_len = 0, cur_len = 0;
        int head_p = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (set.add(s.charAt(i)))
                cur_len++;
            else {
                max_len = cur_len > max_len ? cur_len : max_len;
                for (int j = head_p; j < i; j++) {
                    if (s.charAt(j) == s.charAt(i)) {
                        set.remove(s.charAt(j));
                        cur_len--;
                        head_p = j + 1;
                        break;
                    }
                    set.remove(s.charAt(j));
                    cur_len--;
                }
                i--;
            }

        }
        max_len = cur_len > max_len ? cur_len : max_len;
        return max_len;
    }
}