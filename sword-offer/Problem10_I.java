package Problem10_I;

public class Problem10_I {
    public static void main(String[] args) {
        System.out.println(new Solution().fib(48));
    }
}

class Solution {
    public int fib(int n) {
        if (n == 0)
            return 0;
        long smaller = 0, larger = 1;
        for (int i = 1; i < n; i++) {
            long temp = (smaller + larger) % 1000000007;
            smaller = larger;
            larger = temp;
        }
        return (int)larger;
    }
}