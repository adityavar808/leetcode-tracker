// Last updated: 11/19/2025, 1:28:17 AM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] newArr = new int[2 * n];

        for (int i = 0; i < 2 * n; i++) {
            newArr[i] = nums[i % n];
        }

        return newArr;
    }
}
