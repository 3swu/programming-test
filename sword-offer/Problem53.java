package Problem53;

public class Problem53 {
}

class Solution {
    public int missingNumber(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == mid) left = mid + 1;
            else{
                if (mid == 0 || nums[mid - 1] == mid - 1)
                    return mid;
                right = mid - 1;
            }
        }
        if (left == nums.length)
            return nums.length;
        return -1;
    }
}