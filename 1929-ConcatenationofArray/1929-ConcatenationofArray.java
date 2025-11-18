// Last updated: 11/19/2025, 1:42:02 AM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int tempCount = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                tempCount++;
            }
            else{
                tempCount = 0;
            }
            count = Math.max(count, tempCount);
        }
        return count;
    }
}