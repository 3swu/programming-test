package Problem14_II;

public class Problem14_II {
    public static void main(String[] args) {
        System.out.println(new Solution().cuttingRope(10));
    }
}

class Solution {
    public int cuttingRope(int n) {
        if (n < 2)
            return 0;
        if (n == 2)
            return 1;
        if (n == 3)
            return 2;

        long result = 1;
        int mod = 1000000007;
        while (n > 4) {
            result *= 3;
            result %= mod;
            n -= 3;
        }
        return (int)(result * n % mod);
    }
}