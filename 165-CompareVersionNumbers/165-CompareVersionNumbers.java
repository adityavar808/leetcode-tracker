// Last updated: 9/23/2025, 7:15:49 PM
class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int maxLength = Math.max(v1.length, v2.length);

        for (int i = 0; i < maxLength; i++) {
            int part1 = 0;
            if (i < v1.length) {
                part1 = Integer.parseInt(v1[i]);
            }

            int part2 = 0;
            if (i < v2.length) {
                part2 = Integer.parseInt(v2[i]);
            }

            if (part1 < part2) {
                return -1;
            } else if (part1 > part2) {
                return 1;
            }
        }

        return 0;
    }
}
