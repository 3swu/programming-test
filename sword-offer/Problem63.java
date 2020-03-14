package Problem63;

public class Problem63 {
    public static void main(String[] args) {
        System.out.println(new Solution().maxProfit(new int[]{7,6,5,4,3,2}));
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = 0, max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (i == 0) minPrice = prices[0];
            else minPrice = Math.min(minPrice, prices[i]);
            max = Math.max(max, prices[i] - minPrice);
        }
        return max;
    }
}