// Last updated: 10/12/2025, 9:00:00 AM
class Solution {
    public int longestBalanced(String s) {
        String sCopy = s;
        int n = s.length(), ans = 0;
        for(int i = 0; i < n; i++){
            int[] freq = new int[26];
            for(int j = i; j < n; j++){
                freq[s.charAt(j) - 'a']++;
                int mn = Integer.MAX_VALUE, mx = 0;
                for(int x : freq){
                    if(x > 0){
                        mn = Math.min(mn, x);
                        mx = Math.max(mx, x);
                    }
                }
                if(mn == mx){
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }
}