// Last updated: 8/4/2025, 12:57:54 AM
class Solution {
    public boolean find132pattern(int[] nums) {
        if (nums.length < 3){ 
            return false;
        }

    int min = Integer.MIN_VALUE; 
    int high = nums.length; 

    for (int i = nums.length - 1; i >= 0; i--) {
        if (nums[i] < min) {
            return true;
        }

        while (high < nums.length && nums[i] > nums[high]) {
            min = nums[high]; 
            high++; 
        }         
        high--;
        nums[high] = nums[i]; 
    }
    return false;
}}