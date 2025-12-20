// Last updated: 12/20/2025, 7:10:28 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }

        int rem = sum % k;
        return rem;
    }
}