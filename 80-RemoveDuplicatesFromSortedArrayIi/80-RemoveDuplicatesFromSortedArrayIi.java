// Last updated: 8/4/2025, 12:59:12 AM
class Solution {
  public int removeDuplicates(int[] nums) {
    int i = 0;

    for (final int num : nums)
      if (i < 2 || num > nums[i - 2])
        nums[i++] = num;

    return i;
  }
}