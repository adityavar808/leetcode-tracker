// Last updated: 10/29/2025, 11:40:52 AM
class Solution {
    public int smallestNumber(int n) {
        for (int i = 0; i <= n; i++) {
            int z = 1 << i;
            if (z > n) return z - 1;
        }
        return 0;
    }
}