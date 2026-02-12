// Last updated: 2/12/2026, 4:08:26 PM
1
2class Solution {
3    public int longestBalanced(String s) {
4        int n = s.length();
5        int[] cnt = new int[26];
6        int ans = 0;
7        for (int i = 0; i < n; ++i) {
8            Arrays.fill(cnt, 0);
9            int mx = 0, v = 0;
10            for (int j = i; j < n; ++j) {
11                int c = s.charAt(j) - 'a';
12                if (++cnt[c] == 1) {
13                    ++v;
14                }
15                mx = Math.max(mx, cnt[c]);
16                if (mx * v == j - i + 1) {
17                    ans = Math.max(ans, j - i + 1);
18                }
19            }
20        }
21        return ans;
22    }
23}