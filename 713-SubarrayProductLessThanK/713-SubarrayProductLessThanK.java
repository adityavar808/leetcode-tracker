// Last updated: 8/4/2025, 12:57:41 AM
class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        int start = 0;
        int end = 0;
        int product = 1;
        int ans = 0;
        while (end < arr.length) {
            product = product * arr[end];
            while (product >= k && start <= end) {
                product = product / arr[start];
                start++;
            }
            ans = ans + (end - start + 1);
            end++;
        }
        return ans;
    }
}