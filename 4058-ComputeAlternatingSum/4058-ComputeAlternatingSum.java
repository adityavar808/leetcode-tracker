// Last updated: 10/11/2025, 7:03:26 PM
class Solution {
    public int alternatingSum(int[] nums) {
        int sum = 0;
        if(nums.length == 1){
            return nums[0];
        }
        for(int i = 0; i < nums.length; i++){
            if(i % 2 == 0){
                sum += nums[i];
            }
            else{
                sum -= nums[i];
            }
        }
        return sum;
    }
}