// Last updated: 9/22/2025, 10:35:30 AM
import java.util.*;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101]; 
        for (int num : nums) {
            freq[num]++;
        }

        int maxFreq = 0;
        for (int f : freq) {
            maxFreq = Math.max(maxFreq, f);
        }

        int result = 0;
        for (int f : freq) {
            if (f == maxFreq) {
                result += f;
            }
        }

        return result;
    }
}