// Last updated: 12/20/2025, 7:10:02 PM
class Solution {
    public int minMoves(int[] nums) {
        int count = 0;
        int max = nums[0];

        for(int i = 0; i < nums.length; i++){
            max = Math.max(nums[i], max);
        }

        for(int j = 0; j < nums.length; j++){
            while(nums[j] != max){
                nums[j]++;
                count++;
            }
        }
        return count;
    }
}