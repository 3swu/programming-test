package Problem64;

public class Problem64 {
    public static void main(String[] args) {
        System.out.println(new Solution().sumNums(100));
    }
}

class Solution {
    public int sumNums(int n) {
        boolean t = n > 0 && ((n += sumNums(n - 1)) > 0);
        return n;
    }
}