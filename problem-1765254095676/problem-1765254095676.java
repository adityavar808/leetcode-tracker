// Last updated: 12/9/2025, 9:51:35 AM
1import java.util.*;
2
3class Solution {
4    public int specialTriplets(int[] nums) {
5        int MOD = 1_000_000_007;
6        int n = nums.length;
7        Map<Integer, Integer> leftCount = new HashMap<>();
8        Map<Integer, Integer> rightCount = new HashMap<>();
9
10        for (int num : nums) {
11            rightCount.put(num, rightCount.getOrDefault(num, 0) + 1);
12        }
13
14        long triplets = 0;
15
16        for (int j = 0; j < n; j++) {
17            int mid = nums[j];
18            rightCount.put(mid, rightCount.get(mid) - 1); 
19            int needed = mid * 2;
20
21            long countLeft = leftCount.getOrDefault(needed, 0);
22            long countRight = rightCount.getOrDefault(needed, 0);
23
24            triplets = (triplets + (countLeft * countRight) % MOD) % MOD;
25
26            leftCount.put(mid, leftCount.getOrDefault(mid, 0) + 1); 
27        }
28
29        return (int) triplets;
30    }
31}
32