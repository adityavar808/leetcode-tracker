// Last updated: 12/20/2025, 7:10:05 PM
class Solution {
    public long maxPoints(int[] technique1, int[] technique2, int k) {
        int[][] arr = new int[][] { technique1, technique2 };

        int n = technique1.length;
        long base = 0;
        long[] gain = new long[n];

        for(int i = 0; i < n; i++){
            base += technique2[i];
            gain[i] = (long) technique1[i] - technique2[i];
        }
        Arrays.sort(gain);

        long total = base;

        for(int i = n -1; i >= n - k; i--){
            total += gain[i];
        }

        for(int i = n - k - 1; i >= 0; i--){
            if(gain[i] > 0) total += gain[i];
            else break;
        }
        return total;
    }
}