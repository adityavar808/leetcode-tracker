// Last updated: 8/4/2025, 12:56:36 AM
class Solution {
    public long maximumProduct(int[] nums, int m) {
        int n = nums.length;
        long maxProduct = Long.MIN_VALUE;

        if (m == 1) {
            for (int num : nums) {
                maxProduct = Math.max(maxProduct, 1L * num * num);
            }
            return maxProduct;
        }

        int[] minLeft = new int[n];
        int[] maxLeft = new int[n];
        minLeft[0] = nums[0];
        maxLeft[0] = nums[0];

        for (int i = 1; i < n; i++) {
            minLeft[i] = Math.min(minLeft[i - 1], nums[i]);
            maxLeft[i] = Math.max(maxLeft[i - 1], nums[i]);
        }

        for (int j = m - 1; j < n; j++) {
            int i = j - m + 1;
            long prod1 = 1L * nums[j] * minLeft[i];
            long prod2 = 1L * nums[j] * maxLeft[i];
            maxProduct = Math.max(maxProduct, Math.max(prod1, prod2));
        }

        return maxProduct;
    }
}
