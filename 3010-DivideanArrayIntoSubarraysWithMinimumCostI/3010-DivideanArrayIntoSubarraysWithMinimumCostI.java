// Last updated: 2/2/2026, 1:03:57 AM
1class Solution {
2    public int minimumCost(int[] A) {
3        int a = 51, b = 51;
4
5        for (int i = 1; i < A.length; i++) {
6            if (A[i] < a) {
7                b = a;
8                a = A[i];
9            } else if (A[i] < b)
10                b = A[i];
11
12            if (a == 1 && b == 1) break;
13        }
14
15        return A[0] + a + b;
16    }
17}