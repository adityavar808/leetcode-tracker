// Last updated: 2/21/2026, 1:45:06 PM
1class Solution {
2    public int countPrimeSetBits(int left, int right) {
3        int result = 0;
4
5        boolean[] prime = new boolean[33];
6        prime[2] = prime[3] = prime[5] = prime[7] = 
7        prime[11] = prime[13] = prime[17] = 
8        prime[19] = prime[23] = prime[29] = prime[31] = true;
9
10        for (int i = left; i <= right; i++) {
11            int bits = Integer.bitCount(i);
12            if (prime[bits]) {
13                result++;
14            }
15        }
16
17        return result;
18    }
19}