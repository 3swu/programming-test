package Problem59_I;

import java.util.Arrays;

public class Problem59_I {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().maxSlidingWindow(new int[]{1}, 1)));
    }
}

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) return new int[]{};
        int[] result = new int[nums.length - k + 1];
        int left = 0, right = k - 1;
        int curmax = findMax(nums, left, right);
        result[0] = curmax;
        while (right < nums.length - 1) {
            if (nums[right + 1] >= curmax) {
                curmax = nums[right + 1];
                result[left + 1] = curmax;
            }
            else {
                if (nums[left] == curmax) curmax = findMax(nums, left + 1, right + 1);
                result[left + 1] = curmax;
            }
            left++;
            right++;
        }
        return result;
    }

    private int findMax(int[] nums, int start, int end) {
        int max = Integer.MIN_VALUE;
        for (int i = start; i <= end; i++)
            max = Math.max(max, nums[i]);
        return max;
    }
}