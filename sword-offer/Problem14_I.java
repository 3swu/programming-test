package Problem14_I;

import java.util.Arrays;

public class Problem14_I {
    public static void main(String[] args) {
        System.out.println(new Solution().cuttingRope(10));
    }
}

class Solution {
    public int cuttingRope(int n) {
        if (n == 0 || n == 1)
            return 0;
        if (n == 2)
            return 1;
        if (n == 3)
            return 2;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for (int i = 4; i <= n; i++) {
            int max = 0;
            for (int j = 0; j <= i / 2; j++) {
                max = Math.max(max, dp[j] * dp[i - j]);
            }
            dp[i] = max;
        }
        return dp[n];
    }
}