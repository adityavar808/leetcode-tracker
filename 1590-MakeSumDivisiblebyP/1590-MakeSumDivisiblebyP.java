// Last updated: 11/30/2025, 1:03:52 PM
1class Solution {
2    public int minSubarray(int[] nums, int p) {
3        long total = 0;
4        for (int x : nums) total += x;
5        int need = (int)(total % p);
6        if (need == 0) return 0;
7
8        Map<Integer, Integer> map = new HashMap<>();
9        map.put(0, -1);
10
11        long prefix = 0;
12        int res = nums.length;
13
14        for (int i = 0; i < nums.length; i++) {
15            prefix = (prefix + nums[i]) % p;
16            int target = (int)((prefix - need + p) % p);
17            if (map.containsKey(target)) 
18                res = Math.min(res, i - map.get(target));
19            map.put((int)prefix, i);
20        }
21
22        return res == nums.length ? -1 : res;
23    }
24}