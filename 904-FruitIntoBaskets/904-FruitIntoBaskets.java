// Last updated: 8/4/2025, 10:23:20 PM
class Solution {
  public long maximumTripletValue(int[] nums) {
    long ans = 0;
    int maxDiff = 0; 
    int maxNum = 0;

    for (final int num : nums) {
      ans = Math.max(ans, (long) maxDiff * num);
      maxDiff = Math.max(maxDiff, maxNum - num); 
      maxNum = Math.max(maxNum, num);
    }

    return ans;
  }
}