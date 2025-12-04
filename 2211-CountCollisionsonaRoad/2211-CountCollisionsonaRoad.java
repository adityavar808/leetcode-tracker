// Last updated: 12/4/2025, 9:10:15 PM
1class Solution {
2    public int countCollisions(String D) {
3        final int n = D.length();
4        if (n == 1)
5            return 0;
6        int l = 0, r = n - 1;
7        while (l < r && D.charAt(l) == 'L')
8            l++;
9        while (l < r && D.charAt(r) == 'R')
10            r--;
11        if (l >= r)
12            return 0;
13        int col = 0;
14        for (; l <= r; l++) {
15            col += (D.charAt(l) != 'S' ? 1 : 0);
16        }
17        return col;
18    }
19}