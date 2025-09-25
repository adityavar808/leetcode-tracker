// Last updated: 9/25/2025, 11:57:36 AM
class Solution {
    public int minimumTotal(List<List<Integer>> tri) {
        for (int i = tri.size() - 2; i >= 0; i--)
            for (int j = 0; j < tri.get(i).size(); j++)
                tri.get(i).set(j, tri.get(i).get(j) + Math.min(
                    tri.get(i + 1).get(j),
                    tri.get(i + 1).get(j + 1)
                ));
        return tri.get(0).get(0);
    }
}