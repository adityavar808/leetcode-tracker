// Last updated: 9/10/2025, 12:26:47 PM
public class Solution 
{
    public int maximumUniqueSubarray(int[] nums) 
    {
        int n = nums.length;

        int[] prefixSum = new int[n + 1];
        for (int i = 0; i < n; ++i)
        {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }

        int[] lastSeen = new int[10001];

        int left = 0, maxSum = 0;
        for (int right = 1; right <= n; ++right) 
        {
            int val = nums[right - 1];

            left = Math.max(left, lastSeen[val]);

            maxSum = Math.max(maxSum, prefixSum[right] - prefixSum[left]);

            lastSeen[val] = right;
        }

        return maxSum;
    }
}