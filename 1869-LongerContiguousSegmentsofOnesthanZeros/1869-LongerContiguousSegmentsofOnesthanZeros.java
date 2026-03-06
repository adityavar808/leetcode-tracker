// Last updated: 3/6/2026, 10:47:43 AM
1class Solution {
2    public boolean checkZeroOnes(String s) {
3
4        int max0 = 0;
5        int max1 = 0;
6
7        int count0 = 0;
8        int count1 = 0;
9
10        for (char ch : s.toCharArray()) {
11
12            if (ch == '0') {
13                count0++;
14                count1 = 0;
15                max0 = max0 < count0 ? count0 : max0;
16            } else {
17                count1++;
18                count0 = 0;
19                max1 = max1 < count1 ? count1 : max1;
20            }
21        }
22
23        return max1 > max0;
24    }
25}