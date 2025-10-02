// Last updated: 10/2/2025, 2:39:13 PM
class Solution {
    public int maxBottlesDrunk(int numBottles, int x) {
        int ans = numBottles;
        while (numBottles >= x) {
            numBottles -= x - 1;
            x++;
            ans++;
        }
        return ans;
    }
}