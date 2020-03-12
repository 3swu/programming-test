package Problem51;

public class Problem51 {
    public static void main(String[] args) {
        System.out.println(new Solution().reversePairs(new int[]{7,5,6,4}));
    }
}

class Solution {
    public int reversePairs(int[] nums) {
        return nums.length == 0 ? 0 : core(nums, 0, nums.length - 1);
    }

    private int core(int[] nums, int start, int end) {
        if (start == end) return 0;
        int[] temp = new int[end - start + 1];
        int mid = (end - start) / 2;
        int leftNum = core(nums, start, start + mid);
        int rightNum = core(nums, start + mid + 1, end);
        int leftP = start + mid;
        int rightP = end;
        int tempP = temp.length - 1;
        int n = 0;
        while (leftP >= start && rightP >= start + mid + 1) {
            if (nums[leftP] > nums[rightP]) {
                n += rightP - (start + mid);
                temp[tempP--] = nums[leftP--];
            }
            else temp[tempP--] = nums[rightP--];
        }
        for (; leftP >= start; ) temp[tempP--] = nums[leftP--];
        for (; rightP >= start + mid + 1;) temp[tempP--] = nums[rightP--];
        System.arraycopy(temp, 0, nums, start, temp.length);
        return n + leftNum + rightNum;
    }
}