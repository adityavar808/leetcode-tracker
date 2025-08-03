// Last updated: 8/4/2025, 12:56:34 AM
import java.util.*;

class Solution {
    public int specialTriplets(int[] nums) {
        int MOD = 1_000_000_007;
        int n = nums.length;
        Map<Integer, Integer> leftCount = new HashMap<>();
        Map<Integer, Integer> rightCount = new HashMap<>();

        for (int num : nums) {
            rightCount.put(num, rightCount.getOrDefault(num, 0) + 1);
        }

        long triplets = 0;

        for (int j = 0; j < n; j++) {
            int mid = nums[j];
            rightCount.put(mid, rightCount.get(mid) - 1); 
            int needed = mid * 2;

            long countLeft = leftCount.getOrDefault(needed, 0);
            long countRight = rightCount.getOrDefault(needed, 0);

            triplets = (triplets + (countLeft * countRight) % MOD) % MOD;

            leftCount.put(mid, leftCount.getOrDefault(mid, 0) + 1); 
        }

        return (int) triplets;
    }
}
