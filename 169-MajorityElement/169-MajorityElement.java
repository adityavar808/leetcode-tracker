// Last updated: 8/20/2025, 10:19:45 AM
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int arrLength = nums.length;
        int midIdx = arrLength / 2;
        return nums[midIdx];
    }
}