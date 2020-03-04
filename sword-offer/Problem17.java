package Problem17;

import java.util.Arrays;

public class Problem17 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().printNumbers(2)));
    }
}

class Solution {
    public int[] printNumbers(int n) {
        int[] result = new int[(int)Math.pow(10, n) - 1];
        for (int i = 1; i <= result.length; i++)
            result[i - 1] = i;
        return result;
    }
}