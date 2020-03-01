package Problem12;

import java.util.Arrays;

public class Problem12 {
    public static void main(String[] args) {
        char[][] test = new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        System.out.println(new Solution().exist(test, "ABCCED"));
    }
}

class Solution {
    public boolean exist(char[][] board, String word) {
        int row = board.length, col = row == 0 ? 0 : board[0].length;
        int[][] flag = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (dfs(board, flag, word, 0, i, j))
                    return true;
                for (int[] line : flag)
                    Arrays.fill(line, 0);
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, int[][] flag, String word, int pOfWord, int i, int j) {
        if (pOfWord == word.length())
            return true;
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length)
            return false;
        if (flag[i][j] == 1)
            return false;
        if (board[i][j] == word.charAt(pOfWord)) {
            flag[i][j] = 1;
            pOfWord++;
            boolean hasPath = dfs(board, flag, word, pOfWord, i + 1, j) ||
                                dfs(board, flag, word, pOfWord, i - 1, j) ||
                                dfs(board, flag, word, pOfWord, i, j + 1) ||
                                dfs(board, flag, word, pOfWord, i, j - 1);
            if (!hasPath) {
                flag[i][j] = 0;
            }
            return hasPath;

        }
        return false;
    }
}