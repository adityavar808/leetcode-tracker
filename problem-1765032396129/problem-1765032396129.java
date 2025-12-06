// Last updated: 12/6/2025, 8:16:36 PM
1class Solution {
2    public int[] minOperations(int[] nums) {
3        int[] arr = nums;
4        int n = nums.length;
5        int[] ans = new int[n];
6
7        for(int i = 0; i < n; i++){
8            int x = nums[i];
9            if(isBinaryPalindrone(x)){
10                ans[i] = 0;
11                continue;
12            }
13
14            int up = x;
15            while(!isBinaryPalindrone(up)) up++;
16
17            int down = x;
18            while(down > 0 && !isBinaryPalindrone(down)) down--;
19
20            int inc = up - x;
21            int dec = x - down;
22            ans[i] = Math.min(inc, dec);
23        }
24        return ans;
25    }
26
27    private boolean isBinaryPalindrone(int x){
28        String s = Integer.toBinaryString(x);
29        int l = 0, r = s.length() - 1;
30        while(l < r){
31            if(s.charAt(l) != s.charAt(r)) return false;
32            l++;
33            r--;
34        }
35        return true;
36    }
37}