package Problem45;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Problem45 {
    public static void main(String[] args) {
        System.out.println(new Solution().minNumber(new int[]{3,30,34,5,9}));
    }
}

class Solution {
    public String minNumber(int[] nums) {
        List<String> list = new ArrayList<>();
        for (var n : nums)
            list.add(String.valueOf(n));
        Comparator<String> cmp = new Comparator<String>() {
            @Override
            public int compare(String t0, String t1) {
                long num1 = Long.parseLong(t0 + t1);
                long num2 = Long.parseLong(t1 + t0);
                return (int)(num1 - num2);
            }
        };
        list.sort(cmp);
        var sb = new StringBuilder();
        for (var s : list)
            sb.append(s);
        return sb.toString();
    }
}