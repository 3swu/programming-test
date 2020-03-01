package Problem13;

public class Problem13 {
    public static void main(String[] args) {
        System.out.println(new Solution().movingCount(2, 3, 1));
    }
}

class Solution {
    public int movingCount(int m, int n, int k) {
        int[][] visited = new int[m][n];
        return dfs(m, n, k, 0, 0, visited);
    }

    private int dfs(int m, int n, int k, int i, int j, int[][] visited) {
        if (i < 0 || i >= m || j < 0 || j >= n)
            return 0;
        if (visited[i][j] == 1)
            return 0;
        if (!helper(i, j, k))
            return 0;
        visited[i][j] = 1;
        return 1 + dfs(m, n, k, i + 1, j, visited) +
                dfs(m, n, k, i - 1, j, visited) +
                dfs(m, n, k, i, j + 1, visited) +
                dfs(m, n, k, i, j - 1, visited);
    }

    boolean helper(int i, int j, int k) {
        char[] list = (String.valueOf(i) + String.valueOf(j)).toCharArray();
        int sum = 0;
        for (char c : list)
            sum += Integer.parseInt(String.valueOf(c));
        return !(sum > k);
    }
}