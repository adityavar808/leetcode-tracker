// Last updated: 11/8/2025, 2:04:43 AM
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int shortestSequence(int[] rolls, int k) {
        int res = 1;
        Set<Integer> set = new HashSet<>();

        for (int roll : rolls) {
            set.add(roll);
            if (set.size() == k) {
                res++;
                set.clear();
            }
        }

        return res;
    }
}
