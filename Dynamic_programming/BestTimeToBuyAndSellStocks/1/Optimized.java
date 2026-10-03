public class Optimized {
    public static int maxProfit(int[] prices){
        int min = prices[0];
        int maximumProfit = 0;
        for(int i = 1; i < prices.length; i++){
            int profit = prices[i] - min;
            maximumProfit = Math.max(profit, maximumProfit);
            min = Math.min(min, prices[i]);
        }
        return maximumProfit;
    }
    public static void main(String[] args) {
        int [] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}

// Time Complexity - O(n)
// Space Complexity - O(1)
// Leetcode - 121 - https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
