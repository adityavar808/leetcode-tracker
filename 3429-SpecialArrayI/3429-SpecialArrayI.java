// Last updated: 8/4/2025, 12:56:44 AM
class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length == 1){
            return true;
        }
        boolean flag = true;
        for(int i = 0; i < nums.length-1; i++){
            if((nums[i] % 2 == 0 && nums[i+1] % 2 == 0) || (nums[i] % 2 != 0 && nums[i+1] % 2 != 0)){
                flag = false;
                break;
            }
        }
        return flag;
    }
}