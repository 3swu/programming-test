package Problem46;

public class Problem46 {
    public static void main(String[] args) {
        System.out.println(new Solution().translateNum(624));
    }
}
class Solution {
    public int translateNum(int num) {
        if (num < 10) return 1;
        if (num < 26) return 2;
        if (num < 100) return 1;
        return translateNum(help1(num)) + (help(num) ? translateNum(help2(num)) : 0);

    }

    // 减去最高的一位数字
    private int help1(int num) {
        return num % (int)Math.pow(10, String.valueOf(num).length() - 1);
    }

    //减去最高两位数字
    private int help2(int num) {
        return num % (int)Math.pow(10, String.valueOf(num).length() - 2);
    }

    // 判断头两位是否小于26
    private boolean help(int num) {
        return Integer.parseInt(String.valueOf(num).substring(0, 2)) < 26;
    }
}
