// Last updated: 10/11/2025, 7:03:32 PM
class Solution {
    public int longestSubsequence(int[] nums) {
        int[] stored = nums;
        int totalXor = 0;
        boolean hasnonzero = false;
        for( int num : nums){
            totalXor ^= num;
            if(num != 0) hasnonzero = true;
        }

        int n = nums.length;
        if(totalXor != 0){
            return n;
        }
        else{
            return hasnonzero ? n - 1 : 0;
        }
    }
}