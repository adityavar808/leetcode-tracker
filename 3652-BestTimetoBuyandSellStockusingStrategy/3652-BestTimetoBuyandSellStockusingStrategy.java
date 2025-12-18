// Last updated: 12/18/2025, 2:48:34 PM
1class Solution {
2    public long maxProfit(int[] prices, int[] strategy, int k) {
3        int n = prices.length;
4        long originalProfit = 0;
5        for(int i = 0; i < n; i++){
6            originalProfit += (long) strategy[i] * prices[i];
7        }
8
9        long[] remove = new long[n];
10        long[] setOne = new long[n];
11
12        for(int i = 0; i < n; i++){
13            remove[i] = (0L - strategy[i]) * prices[i];
14            setOne[i] = (1L - strategy[i]) * prices[i];
15        }
16
17        long[] prefRemove = new long[n+1];
18        long[] prefsetOne = new long[n+1];
19        for(int i = 0; i < n; i++){
20            prefRemove[i+1] = prefRemove[i] + remove[i];
21            prefsetOne[i+1] = prefsetOne[i] + setOne[i];
22        }
23
24        long maxDelta = 0;
25        int half = k/2;
26        for(int i = 0; i + k <= n; i++){
27            long firstHalf = prefRemove[i + half] - prefRemove[i];
28            long secondHalf = prefsetOne[i + k] - prefsetOne[i + half];
29            long delta = firstHalf + secondHalf;
30            if (delta > maxDelta) maxDelta = delta;
31        }
32        
33        return originalProfit + maxDelta;
34    }
35}