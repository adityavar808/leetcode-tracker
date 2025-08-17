// Last updated: 8/18/2025, 1:30:15 AM
class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for(int i = 1; i <= s.length(); i ++)
        {
            int x = 26 - (s.charAt(i - 1) - 'a');
            sum += i * x;
        }
        return sum;
    }
}