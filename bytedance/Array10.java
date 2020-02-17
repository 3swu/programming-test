package Array10;

public class Array10 {
    public static void main(String[] args) {
        System.out.println(new Solution().trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}

class Solution {
    public int trap(int[] height) {
        int[] max_left = new int[height.length];
        int[] max_right = new int[height.length];
        int ans = 0;
        for (int i = 0; i < height.length; i++) {
            max_left[i] = i == 0 ? 0 : Math.max(max_left[i - 1], height[i - 1]);
        }
        for (int i = height.length - 1; i >=0; i--) {
            max_right[i] = i == height.length - 1 ? 0 : Math.max(max_right[i + 1], height[i + 1]);
        }
        for (int i = 0; i < height.length; i++) {
            int min_height = Math.min(max_left[i], max_right[i]);
            if (min_height > height[i])
                ans += min_height - height[i];
        }
        return ans;
    }
}