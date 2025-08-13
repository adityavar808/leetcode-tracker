// Last updated: 8/13/2025, 12:18:05 PM
class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int unplaced = 0;
        boolean[] used = new boolean[baskets.length];

        for (int i = 0; i < fruits.length; i++) {
            boolean placed = false;

            for (int j = 0; j < baskets.length; j++) {
                if (!used[j] && fruits[i] <= baskets[j]) {
                    used[j] = true;
                    placed = true;
                    break;
                }
            }

            if (!placed) {
                unplaced++;
            }
        }

        return unplaced;
    }
}
