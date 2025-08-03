// Last updated: 8/4/2025, 12:57:42 AM
class Solution {
    public boolean checkPossibility(int[] nums) {
           int n = nums.length;
        int count=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                count++;
                if(count>1){
                    return false;
                }
                if(i>0 && nums[i-1]>nums[i+1]){
                    nums[i+1]=nums[i];
                }
            }
            
        }

        return true;
    }
}