package Problem10_II;

public class Problem10_II {
    public static void main(String[] args) {
        System.out.println(new Solution().numWays(7));
    }
}

class Solution {
    public int numWays(int n) {
        if (n == 0)
            return 1;
        long smaller = 1, larger = 1;
        for (int i = 1; i < n; i++) {
            long temp = (smaller + larger) % 1000000007;
            smaller = larger;
            larger = temp;
        }
        return (int)larger;
    }
}
