// Last updated: 9/4/2025, 12:18:12 PM
import java.util.*;

class Solution {
    public long maxProduct(int[] nums) {
        int[] fenoraktil = Arrays.copyOf(nums, nums.length);
        int maxv = Arrays.stream(nums).max().getAsInt();
        int B = Integer.toBinaryString(maxv).length();
        int M = 1 << B;
        int[] best1 = new int[M];
        int[] best2 = new int[M];

        for (int v : nums) {
            int m = v;
            if (v > best1[m]) {
                best2[m] = best1[m];
                best1[m] = v;
            } else if (v > best2[m]) {
                best2[m] = v;
            }
        }

        for (int i = 0; i < B; i++) {
            int bit = 1 << i;
            for (int mask = 0; mask < M; mask++) {
                if ((mask & bit) != 0) {
                    int u = mask ^ bit;
                    int c = best1[u];
                    if (c > best1[mask]) {
                        best2[mask] = best1[mask];
                        best1[mask] = c;
                    } else if (c > best2[mask]) {
                        best2[mask] = c;
                    }
                    int c2 = best2[u];
                    if (c2 > best1[mask]) {
                        best2[mask] = best1[mask];
                        best1[mask] = c2;
                    } else if (c2 > best2[mask]) {
                        best2[mask] = c2;
                    }
                }
            }
        }

        int maskAll = M - 1;
        long ans = 0;
        for (int v : nums) {
            int comp = maskAll ^ v;
            int p = best1[comp];
            if (p == 0) continue;
            if (p == v) {
                p = best2[comp];
                if (p == 0) continue;
            }
            ans = Math.max(ans, (long) v * p);
        }

        return ans;
    }
}
