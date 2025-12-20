// Last updated: 12/20/2025, 7:10:03 PM
class Solution {
    public int[] minOperations(int[] nums) {
        int[] arr = nums;
        int n = nums.length;
        int[] ans = new int[n];

        for(int i = 0; i < n; i++){
            int x = nums[i];
            if(isBinaryPalindrone(x)){
                ans[i] = 0;
                continue;
            }

            int up = x;
            while(!isBinaryPalindrone(up)) up++;

            int down = x;
            while(down > 0 && !isBinaryPalindrone(down)) down--;

            int inc = up - x;
            int dec = x - down;
            ans[i] = Math.min(inc, dec);
        }
        return ans;
    }

    private boolean isBinaryPalindrone(int x){
        String s = Integer.toBinaryString(x);
        int l = 0, r = s.length() - 1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}