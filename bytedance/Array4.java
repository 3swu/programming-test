package Array4;

public class Array4 {
    public static void main(String[] args) {
        System.out.println(
                new Solution().findLengthOfLCIS(
                        new int[]{1,3,5,4,7}
                )
        );
    }
}

class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max_len = 0, cur_len = 0;
        for (int i = 0; i < nums.length; i++) {
            cur_len = i == 0 ? 1 : (nums[i] > nums[i - 1] ? cur_len + 1 : 1);
            max_len = Math.max(max_len, cur_len);
        }
        return max_len;
    }
}