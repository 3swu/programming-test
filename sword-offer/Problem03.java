package Problem03;

public class Problem03 {
    public static void main(String[] args) {
        System.out.println(new Solution().findRepeatNumber(new int[]{2, 3, 1, 0, 2, 5, 3}));
    }
}

class Solution {
    public int findRepeatNumber(int[] nums) {
        int[] flag = new int[nums.length];
        for (int n : nums) {
            if (flag[n] == 1)
                return n;
            flag[n] = 1;
        }
        return 0;
    }
}