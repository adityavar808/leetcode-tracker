// Last updated: 8/19/2025, 1:49:05 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for(int a = 0; a < nums.length; a++){
            if(nums[a] != nums[j]){
                nums[++j] = nums[a];
            }
        }
        return j+1;
    }
}