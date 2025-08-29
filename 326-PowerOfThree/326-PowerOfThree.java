// Last updated: 8/30/2025, 12:06:39 AM
public class Solution {
    public boolean isPowerOfThree(int n) {
        int maxPowerOf3 = 1162261467; // 3^19 is the largest power of 3 in int range
        return n > 0 && maxPowerOf3 % n == 0;
    }
}