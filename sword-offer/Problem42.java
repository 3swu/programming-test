package Problem42;

public class Problem42 {
    public static void main(String[] args) {
        System.out.println(new Solution().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}

class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;
        int maxSum = Integer.MIN_VALUE;
        int curSum = -1;
        for (int n : nums) {
            if (curSum < 0) curSum = n;
            else curSum += n;
            maxSum = Math.max(maxSum, curSum);
        }
        return maxSum;
    }
}