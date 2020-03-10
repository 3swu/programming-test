package Problem47;

public class Problem47 {
}

class Solution {
    public int maxValue(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        int[][] dp = new int[rows][cols];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                if (i == 0 && j == 0) dp[j][i] = grid[j][i];
                else if (i == 0) dp[j][i] = dp[j - 1][i] + grid[j][i];
                else if (j == 0) dp[j][i] = dp[j][i - 1] + grid[j][i];
                else dp[j][i] = Math.max(dp[j - 1][i], dp[j][i - 1]) + grid[j][i];
            }
        }
        return dp[rows - 1][cols - 1];
    }
}