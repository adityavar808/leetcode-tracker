// Last updated: 12/2/2025, 10:02:32 PM
1import java.util.*;
2
3class Solution {
4    public int countTrapezoids(int[][] points) {
5        final long MOD = 1_000_000_007L;
6        final long INV2 = (MOD + 1) / 2;
7
8        HashMap<Integer, Integer> freq = new HashMap<>();
9        for (int[] p : points) {
10            int y = p[1];
11            freq.put(y, freq.getOrDefault(y, 0) + 1);
12        }
13
14        long sumF = 0;
15        long sumF2 = 0;
16
17        for (int c : freq.values()) {
18            if (c >= 2) {
19                long cc = c;
20                long f = (cc * (cc - 1) / 2) % MOD;
21                sumF = (sumF + f) % MOD;
22                sumF2 = (sumF2 + f * f % MOD) % MOD;
23            }
24        }
25
26        long ans = (sumF * sumF) % MOD;
27        ans = (ans - sumF2 + MOD) % MOD;
28        ans = ans * INV2 % MOD;
29
30        return (int) ans;
31    }
32}