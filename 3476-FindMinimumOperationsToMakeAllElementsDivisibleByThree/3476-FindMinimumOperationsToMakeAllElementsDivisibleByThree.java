// Last updated: 12/20/2025, 7:11:03 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int operation = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 3 == 0){
                continue;
            }
            else{
                int op = 3 - nums[i];
                if(op == 1){
                    nums[i]++;
                    operation++;
                }
                else{
                    nums[i] = nums[i] - op;
                    operation++;
                }
            }
        }
        return operation;
    }
}