// Last updated: 8/21/2025, 1:01:52 AM
class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max_profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min){
              min = prices[i];  
            } 
            int a = prices[i] - min;
            if (a > max_profit){
                max_profit = prices[i] - min;
            } 
        }

        return max_profit;
    }
}
