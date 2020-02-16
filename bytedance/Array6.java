package Array6;

import java.util.Arrays;

public class Array6 {
    public static void main(String[] args) {
        System.out.println(new Solution().longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    }
}

class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max_inc_len = nums.length == 0 ? 0 : 1, max_dec_len = nums.length == 0 ? 0 : 1;
        int cur_inc_len = 0, cur_dec_len = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0)
                cur_inc_len = cur_dec_len = 1;
            else if (nums[i] == nums[i - 1] + 1) {
                cur_inc_len++;
                max_inc_len = Math.max(max_inc_len, cur_inc_len);
                max_dec_len = Math.max(max_dec_len, cur_dec_len);
                cur_dec_len = 1;
            }
            else if (nums[i] == nums[i - 1] - 1) {
                cur_dec_len++;
                max_dec_len = Math.max(max_dec_len, cur_dec_len);
                max_inc_len = Math.max(max_inc_len, cur_dec_len);
                cur_inc_len = 1;
            }
            else if (nums[i] == nums[i - 1])
                continue;
            else {
                max_dec_len = Math.max(max_dec_len, cur_dec_len);
                max_inc_len = Math.max(max_inc_len, cur_inc_len);
                cur_dec_len = cur_inc_len = 1;
            }
        }
        return Math.max(max_inc_len, max_dec_len);

    }
}