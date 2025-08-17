// Last updated: 8/18/2025, 1:30:18 AM
class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        int n = prices.length;
        long originalProfit = 0;
        for(int i = 0; i < n; i++){
            originalProfit += (long) strategy[i] * prices[i];
        }

        long[] remove = new long[n];
        long[] setOne = new long[n];

        for(int i = 0; i < n; i++){
            remove[i] = (0L - strategy[i]) * prices[i];
            setOne[i] = (1L - strategy[i]) * prices[i];
        }

        long[] prefRemove = new long[n+1];
        long[] prefsetOne = new long[n+1];
        for(int i = 0; i < n; i++){
            prefRemove[i+1] = prefRemove[i] + remove[i];
            prefsetOne[i+1] = prefsetOne[i] + setOne[i];
        }

        long maxDelta = 0;
        int half = k/2;
        for(int i = 0; i + k <= n; i++){
            long firstHalf = prefRemove[i + half] - prefRemove[i];
            long secondHalf = prefsetOne[i + k] - prefsetOne[i + half];
            long delta = firstHalf + secondHalf;
            if (delta > maxDelta) maxDelta = delta;
        }
        
        return originalProfit + maxDelta;
    }
}