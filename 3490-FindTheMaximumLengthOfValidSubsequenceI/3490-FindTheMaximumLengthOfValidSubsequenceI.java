// Last updated: 8/4/2025, 12:56:42 AM
class Solution {
    public int maximumLength(int[] nums) {
        int k = 2;
        int[][] frequency = new int[k][k];
        int maxLength = 0; 

        for (int num : nums) {
            num %= k; 
            for (int j = 0; j < k; ++j) {
                int y = (j - num + k) % k; 
                frequency[num][y] = frequency[y][num] + 1; 
                maxLength = Math.max(maxLength, frequency[num][y]);
            }
        }
        return maxLength;
    
    }
}