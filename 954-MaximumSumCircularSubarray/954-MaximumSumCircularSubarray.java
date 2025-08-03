// Last updated: 8/4/2025, 12:57:37 AM
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        return MaximumSum(nums);
    }
    public static int MaximumSum(int[] arr) {
		int linear_sum = KadensAlgo(arr);
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			arr[i] = arr[i] * -1;
		}
		int mid = KadensAlgo(arr);
		int CircularSum = sum + mid; // circular sum
		if (CircularSum == 0) {
			return linear_sum;
		}
		return Math.max(linear_sum, CircularSum);
	}

	public static int KadensAlgo(int[] arr) {
		int maxSum = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			maxSum = Math.max(maxSum, sum);
			if (sum < 0) {
				sum = 0;
			}
		}
		return maxSum;
	}
}