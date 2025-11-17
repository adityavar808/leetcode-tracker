// Last updated: 11/17/2025, 10:57:40 PM
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
