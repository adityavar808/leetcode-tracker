// Last updated: 11/27/2025, 10:19:28 AM
1class Solution {
2    public long maxSubarraySum(int[] nums, int k) {
3        long prefSum = 0;
4        long subMax = Long.MIN_VALUE;
5        long[] minSoFar = new long[k];
6        Arrays.fill(minSoFar, Long.MAX_VALUE / 2);
7        minSoFar[(k - 1) % k] = 0;
8
9        for (int i = 0; i < nums.length; i++) {
10            prefSum += nums[i];
11            subMax = Math.max(subMax, prefSum - minSoFar[i % k]);
12            minSoFar[i % k] = Math.min(minSoFar[i % k], prefSum);
13        }
14
15        return subMax;
16    }
17}
18