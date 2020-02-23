package Dp4;

public class Dp4 {
    public static void main(String[] args) {
        System.out.println(new Solution().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}

class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum = nums[0], cur_sum = 0;
        for (int n : nums) {
            if (cur_sum <= 0) {
                cur_sum = n;
            }
            else {
                cur_sum += n;
            }
            max_sum = Math.max(max_sum, cur_sum);
        }
        return Math.max(max_sum, cur_sum);
    }
}