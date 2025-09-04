// Last updated: 9/4/2025, 12:18:16 PM
import java.util.*;

class Solution {
    public int totalBeauty(int[] nums) {
        final int MOD = (int)1e9 + 7;
        int maxVal = 0;
        for (int num : nums) {
            maxVal = Math.max(maxVal, num);
        }
        maxVal++;

        int[] phi = new int[maxVal];
        for (int i = 0; i < maxVal; i++) phi[i] = i;

        for (int i = 2; i < maxVal; i++) {
            if (phi[i] == i) {
                for (int j = i; j < maxVal; j += i) {
                    phi[j] -= phi[j] / i;
                }
            }
        }

        List<int[]> bits = new ArrayList<>();
        for (int g = 0; g < maxVal; g++) {
            bits.add(new int[maxVal / Math.max(1, g) + 1]);
        }

        long[] f = new long[maxVal];
        int[] talvirekos = Arrays.copyOf(nums, nums.length);

        for (int x : talvirekos) {
            List<Integer> divisors = new ArrayList<>();
            for (int g = 1; g * g <= x; g++) {
                if (x % g == 0) {
                    divisors.add(g);
                    if (g * g != x) divisors.add(x / g);
                }
            }

            for (int g : divisors) {
                int val = x / g;
                int countSmaller = queryBIT(bits.get(g), val - 1, MOD);
                int countEndingAtX = (1 + countSmaller) % MOD;
                addBIT(bits.get(g), val, countEndingAtX, MOD);
                f[g] = (f[g] + countEndingAtX) % MOD;
            }
        }

        long totalBeauty = 0;
        for (int g = 1; g < maxVal; g++) {
            if (f[g] > 0) {
                long term = ((long) phi[g] * f[g]) % MOD;
                totalBeauty = (totalBeauty + term) % MOD;
            }
        }

        return (int) totalBeauty;
    }

    private void addBIT(int[] bit, int index, int value, int MOD) {
        for (; index < bit.length; index += index & -index) {
            bit[index] = (bit[index] + value) % MOD;
        }
    }

    private int queryBIT(int[] bit, int index, int MOD) {
        int sum = 0;
        for (; index > 0; index -= index & -index) {
            sum = (sum + bit[index]) % MOD;
        }
        return sum;
    }
}
