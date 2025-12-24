// Last updated: 12/24/2025, 4:19:46 PM
1class Solution {
2    public int minimumBoxes(int[] apple, int[] cap) {
3        int sum = Arrays.stream(apple).sum();
4
5        int[] fq = new int[51];
6        int high = 0, low = 51;
7        for (int c : cap) {
8            fq[c]++;
9            high = Math.max(high, c);
10            low = Math.min(low, c);
11        }
12
13        int res = 0;
14        for (int i = high; i >= low && sum > 0; i--) {
15            while (fq[i]-- > 0 && sum > 0) {
16                sum -= i;
17                res++;
18            }
19        }
20
21        return res;
22    }
23}
24