// Last updated: 11/19/2025, 1:35:22 AM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] newArr = new int[2*n];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            newArr[idx++] = nums[i];
            newArr[idx++] = nums[i + n];
        }
        return newArr;
    }
}