package Problem57;

import java.util.Arrays;

public class Problem57 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().twoSum(new int[]{14, 15, 16, 22, 53, 60}, 76)));
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int sum = 0;
        while (left < right) {
            sum = nums[left] + nums[right];
            if (sum < target) left++;
            else if (sum > target) right--;
            else return new int[]{nums[left], nums[right]};
        }
        return null;
    }
}
