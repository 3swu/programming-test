package Problem21;

import java.util.Arrays;

public class Problem21 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().exchange(new int[]{1, 2, 3, 4})));
    }
}

class Solution {
    public int[] exchange(int[] nums) {
        int left = 0, right = nums.length - 1;
        int temp = 0;
        while (left < right) {
            while (left < right && (nums[left] & 1) == 1)
                left++;
            while (left < right && (nums[right] & 1) == 0)
                right --;
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        return nums;
    }
}