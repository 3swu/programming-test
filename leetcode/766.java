class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = row == 0 ? 0 : matrix[0].length;

        for (int i = row - 1; i >= 1; i--) {
            if (!helper(matrix, row, col, i, 0))
                return false;
        }
        for (int j = 0; j < col; j++) {
            if (!helper(matrix, row, col, 0, j))
                return false;
        }
        return true;
    }

    public boolean helper(int[][] matrix, int row, int col, int i, int j) {
        i = i + 1;
        j = j + 1;
        while (i < row && j < col) {
            if (matrix[i][j] != matrix[i - 1][j - 1])
                return false;
            i++;
            j++;
        }
        return true;
    }
}