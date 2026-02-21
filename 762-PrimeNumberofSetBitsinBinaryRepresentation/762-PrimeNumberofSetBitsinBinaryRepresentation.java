// Last updated: 2/21/2026, 1:44:18 PM
1class Solution {
2    public int countPrimeSetBits(int left, int right) {
3        int primeCount = 0;
4        int count = 0;
5        for (int i = left; i <= right; i++) {
6            String bin = Integer.toBinaryString(i);
7            count = Integer.bitCount(i);
8            if(isPrime(count) == true){
9                primeCount++;
10            }
11        }
12        return primeCount;
13    }
14
15    public boolean isPrime(int n) {
16        if (n <= 1)
17            return false;
18        if (n == 2)
19            return true;
20        if (n % 2 == 0)
21            return false;
22
23        for (int i = 3; i * i <= n; i += 2) {
24            if (n % i == 0)
25                return false;
26        }
27
28        return true;
29    }
30}