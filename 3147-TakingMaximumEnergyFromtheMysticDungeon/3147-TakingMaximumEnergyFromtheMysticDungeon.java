// Last updated: 10/10/2025, 4:26:03 PM
class Solution {
    public int maximumEnergy(int[] energy, int k) {
        for (int i = energy.length - k - 1; i >= 0; i--) {
            energy[i] += energy[i + k];
        }
        int maxEnergy = Integer.MIN_VALUE;
        for (int val : energy) {
            if (val > maxEnergy) {
                maxEnergy = val;
            }
        }
        return maxEnergy;
    }
}
