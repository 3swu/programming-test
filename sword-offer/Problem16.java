package Problem16;

public class Problem16 {
    public static void main(String[] args) {
        System.out.println(new Solution().myPow(2.0, -218384937));
    }

}


class Solution {
    public double myPow(double x, int n) {
        if (x == 0)
            return 0;
        long absN = Math.abs((long)n);//避免测试用例溢出
        double result = work(x, absN);
        if (n < 0)
            result = 1 / result;
        return result;
    }

    private double work(double x, long n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return x;
        double subResult = work(x, n >> 1);
        return n % 2 == 0 ? subResult * subResult : subResult * subResult * x;
    }
}