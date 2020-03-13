package Problem60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem60 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().twoSum(2)));
    }
}

class Solution {
    private int[] result;

    public double[] twoSum(int n) {
        if (n == 0) return new double[]{};
        result = new int[6 * n];
        work(n, 0);
        int sum = 0;
        for (var a : result)
            sum += a;
        double[] res = new double[result.length - n + 1];
        for (int i = 0; i < res.length; i++) {
            res[i] = result[i + n - 1] / (double)sum;
        }
        return res;
    }

    private void work(int n, int sum) {
        if (n == 0) result[sum - 1]++;
        else {
            for (int i = 1; i <= 6; i++)
                work(n - 1, sum + i);
        }
    }
}
