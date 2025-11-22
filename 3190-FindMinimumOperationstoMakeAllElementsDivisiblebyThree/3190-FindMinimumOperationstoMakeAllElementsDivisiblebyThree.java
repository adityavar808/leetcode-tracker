// Last updated: 11/22/2025, 9:18:43 PM
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