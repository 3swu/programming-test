package Program1;

public class Program1 {
    public static void main(String[] args) {
        int[][] test = new int[][]{{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(new Solution().countNegatives(test));
    }
}

class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length, n = m == 0 ? 0 : grid[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            int j = 0;
            for (; j < n; j++) {
                if (grid[i][j] < 0)
                    break;
            }
            count += n - j;
        }
        return count;
    }
}