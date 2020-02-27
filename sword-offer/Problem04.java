package Problem04;

public class Problem04 {
    //TODO main
}

class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int row = matrix.length, col = row == 0 ? 0 : matrix[0].length;
        for (int x = 0, y = row - 1; x >= 0 && x < col && y >= 0 && y < row; ) {
            if (matrix[y][x] == target)
                return true;
            else if (matrix[y][x] > target)
                y--;
            else
                x++;
        }
        return false;
    }
}