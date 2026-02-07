// Last updated: 2/7/2026, 10:26:32 AM
1class Solution {
2    public int minimumDeletions(String s) {
3        int n = s.length(), res = n;
4        int a = 0, b = 0;
5
6        for (int i = 0; i < n; i++)
7            a += s.charAt(i) & 1;
8
9        for (int i = 0; i < n; i++) {
10            int c = s.charAt(i);
11            a -= c & 1;
12            res = Math.min(res, a + b);
13            b += (c & 1) ^ 1;
14        }
15
16        return res;
17    }
18}
19