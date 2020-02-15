package Array2;

import java.util.*;

public class Array2 {
    public static void main(String[] args) {
        int[][] test = {{1,1,0,0,0},{1,1,0,0,0},{0,0,0,1,1},{0,0,0,1,1}};
        System.out.println(
                new Solution().maxAreaOfIsland(test));
    }
}

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int[][] mark = new int[grid.length][grid[0].length];
        int max_area = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && !isvisited(mark, new int[]{i, j}))
                    max_area = Math.max(max_area, bfs(grid, mark, new int[]{i, j}));
            }
        }
        return max_area;
    }

    private boolean isvisited(int[][] mark, int[] loc) {
        return mark[loc[0]][loc[1]] == 1;
    }

    private List<int[]> neighbors(int[][] grid, int[] loc) {
        List<int[]> result = new ArrayList<>();
        int row = loc[0], col = loc[1];
        if (row != 0 && grid[row - 1][col] == 1)
            result.add(new int[]{row - 1, col});
        if (col != 0 && grid[row][col - 1] == 1)
            result.add(new int[]{row, col - 1});
        if (row != grid.length - 1 && grid[row + 1][col] == 1)
            result.add(new int[]{row + 1, col});
        if (col != grid[0].length - 1 && grid[row][col + 1] == 1)
            result.add(new int[]{row, col + 1});
        return result;
    }

    private int bfs(int[][] grid, int[][] mark, int[] loc) {
        int count = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(loc);
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            if (!isvisited(mark, cur)) {
                count++;
                mark[cur[0]][cur[1]] = 1;
                for (int[] neighbor : neighbors(grid, cur))
                    if (!isvisited(mark, neighbor))
                        queue.add(neighbor);
            }
        }
        return count;
    }
}