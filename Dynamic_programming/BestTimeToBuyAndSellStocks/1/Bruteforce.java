public class Bruteforce {
    public static int maxProfit(int[] prices){
        int max = 0;
        int n = prices.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int profit = prices[j] - prices[i];
                max = Math.max(profit, max);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] prices = {1,2,3,4,5};
        System.out.println(maxProfit(prices));
    }
}

// Time Complexity - O(n^2)
// Space Complexity - O(1)
// Leetcode - 121 - https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
