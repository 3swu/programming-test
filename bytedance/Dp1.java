package Dp1;

public class dp1 {
    public static void main(String[] args) {
        System.out.println(new Solution().maxProfit(new int[]{7,6,5,4,3,2,1}));
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0, min_price = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < min_price)
                min_price = price;
            else if (price - min_price > max_profit) {
                max_profit = price - min_price;
            }
        }
        return max_profit;
    }
}