package Array8;

import java.util.*;

public class Array8 {
    public static void main(String[] args) {
        int[][] test = new int[][]{{1,1,0}, {1,1,0}, {0,0,1}};
        System.out.println(new Solution().findCircleNum(test));
    }
}

class Solution {
    public int findCircleNum(int[][] M) {
        int n = M.length;
        int[] stu = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!isVisited(stu, i)) {
                bfs(M, stu, i);
                count++;
            }
        }
        return count;
    }

    private boolean isVisited(int[] stu, int n) {
        return stu[n] == 1;
    }

    private List<Integer> neighbors(int[][] M, int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < M.length; i++) {
            if (M[n][i] == 1 && i != n)
                result.add(i);
        }
        return result;
    }

    private void bfs(int[][] M, int[] stu, int n) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            if (!isVisited(stu, cur)) {
                stu[cur] = 1;
                for (int a : neighbors(M, cur))
                    if (!isVisited(stu, a))
                        queue.add(a);
            }
        }
    }
}