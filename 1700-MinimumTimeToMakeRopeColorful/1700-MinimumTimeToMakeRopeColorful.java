// Last updated: 11/8/2025, 2:05:18 AM
class Solution {
    public int minCost(String colors, int[] neededTime) {
        int totalTime = 0, currMaxTime = 0;

        for (int i = 0; i < colors.length(); ++i) {
            if (i > 0 && colors.charAt(i) != colors.charAt(i - 1)) {
                currMaxTime = 0;
            }
            totalTime += Math.min(currMaxTime, neededTime[i]);
            currMaxTime = Math.max(currMaxTime, neededTime[i]);
        }

        return totalTime;
    }
}
