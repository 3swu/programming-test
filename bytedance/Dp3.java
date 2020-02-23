package Dp3;

public class Dp3 {
    //TODO main
}

class Solution {
    public int maximalSquare(char[][] matrix) {
        if (matrix.length == 0)
            return 0;
        int[][] flag = new int[matrix.length + 1][matrix[0].length + 1];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    if (flag[i][j] != 0) {
                        int k = 0;
                        for (; k <= flag[i][j]; k++) {
                            if (matrix[i - k][j] != '1' || matrix[i][j - k] != '1') {
                                flag[i + 1][ j + 1] = k;
                                break;
                            }
                        }
                        if (k == flag[i][j] + 1) {
                            flag[i + 1][j + 1] = flag[i][j] + 1;
                        }
                    }
                    else
                        flag[i + 1][j + 1] = 1;
                }
            }
        }
        int max = 0;
        for (int[] row : flag)
            for (int n : row)
                max = Math.max(max, n);
        return max * max;

    }
}