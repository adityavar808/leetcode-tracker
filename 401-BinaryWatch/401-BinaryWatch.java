// Last updated: 2/17/2026, 8:03:51 PM
1class Solution {
2    public List<String> readBinaryWatch(int k) {
3        if (k == 0) return List.of("0:00");
4        int mask = (1 << 6) - 1;
5        int q = (1 << k) - 1;
6        int limit = q << (10 - k);
7        List<String> res = new ArrayList<>();
8
9        while (q <= limit) {
10            int min = q & mask;
11            int hour = q >> 6;
12            if (hour < 12 && min < 60)
13                res.add(hour + ":" + (min < 10 ? "0" : "") + min);
14            int r = q & -q;
15            int n = q + r;
16            q = (((q ^ n) / r) >> 2) | n;
17        }
18        return res;
19    }
20}